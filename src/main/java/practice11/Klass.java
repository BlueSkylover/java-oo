package practice11;
import java.util.HashSet;


import static java.lang.System.*;

public class Klass {
    int klass;
    Student Leader;

    HashSet<Student> students=new HashSet<>();
    HashSet<Teacher> teachers=new HashSet<>();

    public Klass(int i) {
        this.klass=i;
    }

    public int getNumber() {
        return klass;
    }

    public String getDisplayName() {
        return "Class "+klass;
    }


    public  void setLeader(Student leader){
        this.Leader=leader;
    }
    public Student getLeader() {
        return Leader;
    }

    public void assignLeader(Student jerry) {
        if(jerry.klass.getNumber()!=klass)
            out.print("It is not one of us.\n");
        else
        {
            this.Leader=jerry;
            notifyTeacher(jerry,"leader");
        }
    }

    public void appendTeacher(Teacher teacher){
        teachers.add(teacher);
    }

    public void appendMember(Student jerry) {
          students.add(jerry);
          notifyTeacher(jerry,"student");
    }

    public void notifyTeacher(Student student,String str){
        if(str.equals("student")){
            teachers.stream().filter(teacher -> teacher.isTeaching(student)).forEach(teacher -> teacher.welcomNewStudent(student,this));

        }
        else if(str.equals("leader")){
            teachers.stream().filter(teacher -> teacher.isTeaching(student)).forEach(teacher -> teacher.welcomLeader(student,this));
        }
    }


}

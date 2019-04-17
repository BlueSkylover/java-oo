package practice11;

import java.util.LinkedList;

public class Teacher extends Person {
    int id=getId();
    String name=getName();
    int age=getAge();
    LinkedList<Klass> linkedList =new LinkedList<>();
    Person pp=new Person(id,name,age);
    public Teacher(int id, String name, int age, LinkedList<Klass> linkedList) {
        super(id,name,age);
        this.linkedList=linkedList;
        this.linkedList.forEach(klass -> klass.appendTeacher(this));
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public LinkedList<Klass> getClasses() {
        return linkedList;
    }


    public String introduce() {
        String str=pp.introduce()+" I am a Teacher. ";
        if(linkedList!=null) {
            int num=linkedList.size();
            str+="I teach Class";
            for (int i = 0; i < num; i++)
                str+=" "+linkedList.get(i).getNumber()+",";
            str=str.substring(0,str.length()-1)+".";

        }
        else
            str+="I teach No Class.";
        return str;
    }

    public boolean isTeaching(Student jerry) {
        boolean flag=false;
        if(linkedList.contains(jerry.getKlass()))
            flag=true;
        return  flag;
    }
    public String introduceWith(Student jerry) {
        String str;
        if(linkedList.contains(jerry.getKlass()))
            str=pp.introduce()+" I am a Teacher. I teach "+jerry.name+".";
        else
            str=pp.introduce()+" I am a Teacher. I don't teach "+jerry.name+".";
        return  str;
    }

    public void welcomNewStudent(Student student,Klass klass){
        System.out.print("I am "+getName()+". I know "+student.getName()+" has joined "+klass.getDisplayName()+".\n");
    }
    public void welcomLeader(Student student,Klass klass){
        System.out.print("I am "+getName()+". I know "+student.getName()+" become Leader of "+klass.getDisplayName()+".\n");
    }

}

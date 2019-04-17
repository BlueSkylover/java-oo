package practice09;

public class Klass {
    int klass;
    Student Leader;
    Student append;
    public Klass(int klass) {
        this.klass=klass;
    }

    public int getNumber() {
        return klass ;
    }

    public String getDisplayName() {
        return "Class "+klass;
    }

    public void assignLeader(Student jerry) {
        if(jerry.klass.getNumber()!=klass)
            System.out.print("It is not one of us.\n");
        else
            this.Leader=jerry;
    }
    public Student getLeader() {
         return  Leader;
    }
    public void appendMember(Student jerry) {
        this.append=jerry;
    }
}

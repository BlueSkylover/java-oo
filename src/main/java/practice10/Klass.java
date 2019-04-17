package practice10;

public class Klass {
    int klass;
    Student Leader;
    Student append;
    public Klass(int i) {
        this.klass=i;
    }

    public int getNumber() {
        return klass;
    }

    public String getDisplayName() {
        return "Class "+klass;
    }

    public void assignLeader(Student jerry) {
        if(klass!=jerry.klass.getNumber())
            System.out.print("It is not one of us.\n");
        else
            this.Leader=jerry;
    }

    public Student getLeader() {
        return Leader;
    }

    public void appendMember(Student jerry) {
        this.append=jerry;
    }
}

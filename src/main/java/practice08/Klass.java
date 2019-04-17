package practice08;

public class Klass {
    int Klass;
    Student Leader;
    public Klass(int Klass) {
        this.Klass=Klass;
    }
    public int getNumber() {
        return Klass;
    }

    public String getDisplayName() {
        return "Class "+getNumber();
    }

    public void assignLeader(Student jerry) {
        this.Leader = jerry;

    }
    public Student getLeader() {
        return Leader;
    }


}

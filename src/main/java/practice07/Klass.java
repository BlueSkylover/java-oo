package practice07;

public class Klass {
    int Klass;
    public Klass(int Klass) {
        this.Klass=Klass;
    }

    public int getNumber() {
        return Klass;
    }

    public String getDisplayName() {
        return "Class "+getNumber();
    }
}

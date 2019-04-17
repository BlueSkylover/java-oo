package practice06;

public class Teacher extends Person{
    String name;
    int age;
    int Klass;
    public Teacher(String name, int age, int Klass) {
        super(name, age);
        this.Klass=Klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public int getKlass() {
        return  Klass;
    }
    public String introduce() {
        String name=getName();
        int age=getAge();
        Person p=new Person(name,age);
        String result;
        if (getKlass()>0){
            result=p.introduce()+" I am a Teacher. I teach Class "+getKlass()+".";
        }
        else
            result=p.introduce()+" I am a Teacher. I teach No Class.";
        return result;
    }
}

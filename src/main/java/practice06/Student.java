package practice06;

public class Student extends Person{
    String  name;
    int age;
    int Klass;

    public Student(String name, int age, int Klass) {
        super(name, age);
        this.Klass=Klass;
    }
    public int getKlass() {
        return  Klass;
    }

    public String introduce() {
        String name=getName();
        int age=getAge();
        Person p=new Person(name,age);
        String result=p.introduce()+" I am a Student. I am at Class "+getKlass()+".";
        return result;
    }
}

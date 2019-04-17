package practice07;

public class Student extends Person {
    String  name=getName();
    int age=getAge();
    Person p=new Person(name,age);
    Klass klass=new Klass(2);
    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass=klass;
    }

    public Klass getKlass() {
        return klass;
    }
    public String introduce() {
        String str=p.introduce()+" I am a Student. I am at "+klass.getDisplayName()+".";
        return  str;

    }

}

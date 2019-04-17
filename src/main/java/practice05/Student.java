package practice05;

public class Student extends Person{
    String name;
    int age;
    int class_num;
    public Student(String name, int age, int class_num) {
        super(name, age);
        this.class_num=class_num;
    }

    public int getKlass() {
        return class_num;
    }

    @Override
    public String introduce () {
        String name=getName();
        int age=getAge();
        Person pp=new Person(name,age);
        String str=pp.introduce()+" I am a Student. I am at Class "+getKlass()+".";
        return str;
    }
}
package practice02;

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
    public String introduce() {
         String str="My name is"+getName()+". I am at Class "+getKlass()+ ".";
         return str;
    }
}

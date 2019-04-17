package practice05;

public class Worker extends Person{
    String name;
    int age;
    public Worker(String name, int age) {
        super(name, age);
    }
    public String introduce() {
        String name=getName();
        int age=getAge();
        Person pp=new Person(name,age);
        String str=pp.introduce()+" I am a Worker. I have a job.";
        return str;
    }
}

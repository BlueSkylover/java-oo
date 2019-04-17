package practice03;

public class Worker extends Person{
    String name;
    int age;
    public Worker(String name, int age) {
        super(name, age);
    }
    public String introduce() {
        String str="I am a Worker. I have a job.";
        return str;
    }
}

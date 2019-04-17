package practice04;

public class Worker extends Person{
    String name;
    int age;
    public Worker(String name, int age) {
        super(name, age);
    }
    public String introduce() {

        String str="My name is "+getName()+". I am "+getAge()+" years old."+" I am a Worker. I have a job.";
        return str;
    }
}

package practice06;

public class Person {
    String  name;
    int age;
    public Person(String name, int age) {
        this.name=name;
        this.age=age;
    }
    public String getName() {
        return name;
    }
    public  int getAge(){
        return  age;
    }

    public String introduce() {
        String result="My name is "+getName()+". I am "+getAge()+ " years old.";
        return result;
    }
}

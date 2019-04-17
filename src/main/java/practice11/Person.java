package practice11;

public class Person {
    int id;
    String name;
    int age;
    public Person(int id, String name, int age) {
        this.id=id;
        this.name=name;
        this.age=age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String introduce() {
        String str;
        str="My name is "+name+". I am "+age+" years old.";
        return str;
    }
    public  boolean equals(Object obj){
        boolean flag=false;
        if(obj instanceof  Person){
            Person a =(Person) obj;
            if(id==a.id)
                flag=true;
        }
        return  flag;
    }
}

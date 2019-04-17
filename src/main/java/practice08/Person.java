package practice08;

public class Person {
    int id;
    String name;
    int age;
    public Person(int id, String tom, int age) {
        this.id=id;
        this.name=tom;
        this.age=age;
    }

    public String getName() {
        return name;
    }
    public  int getId(){
        return id;
    }
    public  int getAge(){
        return age;
    }
    public String introduce() {
        String str;

        str="My name is "+getName()+". I am "+getAge()+" years old.";
        return str;
    }
    public boolean equals(Object object){
        boolean flag=false;

        if(object instanceof Person)
        {
            Person a=(Person) object;
            if (id==a.id)
                flag=true;
        }
        return flag;
    }


}

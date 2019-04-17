package practice11;

public class Student extends Person {
    String name=getName();
    int age=getAge();
    Klass klass;
    int id=getId();
    Person pp=new Person(id,name,age);
    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }
    public String introduce() {
        String str="";
        if(klass.getLeader()==null)
        str=pp.introduce()+" I am a Student. I am at "+klass.getDisplayName()+".";
        else if( name==klass.getLeader().name)
            str=pp.introduce()+" I am a Student. I am Leader of "+klass.getDisplayName()+".";
        return str;
    }

}

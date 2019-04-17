package practice09;

public class Teacher extends Person{
    Klass klass;
    int id=getId();
    String name=getName();
    int age=getAge();
    Person pp=new Person(id,name,age);
    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass=klass;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduceWith(Student jerry) {
        String str;
        if(klass.getNumber()==jerry.klass.getNumber())
            str=pp.introduce()+" I am a Teacher. I teach "+jerry.getName()+".";
        else
            str=pp.introduce()+" I am a Teacher. I don't teach "+jerry.getName()+".";
        return  str;
    }
    public String introduce() {
        String str;
        if (klass==null)
            str=pp.introduce()+" I am a Teacher. I teach No Class.";
        else
            str=pp.introduce()+" I am a Teacher. I teach "+klass.getDisplayName()+".";
        return str;
    }
}

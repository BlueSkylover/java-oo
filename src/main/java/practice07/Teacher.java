package practice07;

public class Teacher extends  Person {
    String name=getName();
    int age=getAge();
    Klass klass;
    Person p=new Person(name,age);
    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass=klass;
    }
    public Teacher(String name, int age) {
        super(name, age);
    }

    public Klass getKlass() {
        return  klass;
    }
    public String introduce() {
        String str;
        if(klass==null)
            str=p.introduce()+" I am a Teacher. I teach No Class.";
        else
            str=p.introduce()+" I am a Teacher. I teach "+klass.getDisplayName()+".";
        return  str;
    }

    public String introduceWith(Student jerry) {
        String str;
        int stu_class=jerry.getKlass().getNumber();
        int tea_class=klass.getNumber();
        if(stu_class==tea_class)
            str=p.introduce()+" I am a Teacher. I teach "+jerry.getName()+".";
        else
            str=p.introduce()+" I am a Teacher. I don't teach "+jerry.getName()+".";
        return  str;
    }
}

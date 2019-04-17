package practice10;

import java.util.Collection;
import java.util.LinkedList;

public class Teacher extends Person {
    LinkedList<practice10.Klass> linkedList;
    int id=getId();
    int age=getAge();
    String name=getName();
    Person pp=new Person(id,name,age);
    public Teacher(int id, String name, int age, LinkedList<Klass> linkedList) {
        super(id,name,age);
        this.linkedList=linkedList;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public LinkedList<practice10.Klass> getClasses() {
        return  linkedList;
    }
    public String introduce() {
        String str;
        str=pp.introduce()+" I am a Teacher. I teach Class";
        if(linkedList!=null) {
            int num = linkedList.size();
            for (int i = 0; i < num; i++)
                str += " " + linkedList.get(i).getNumber() + ",";
            str = str.substring(0, str.length() - 1);
            str = str + ".";
        }
        else
            str=pp.introduce()+" I am a Teacher. I teach No Class.";
        return str;
    }

    public boolean isTeaching(Student jerry) {
        boolean flag=false;
        if(linkedList.contains(jerry.klass))
            flag=true;
        return  flag;
    }

    public String introduceWith(Student jerry) {

        String str;
        if(linkedList.contains(jerry.klass))
            str=pp.introduce()+" I am a Teacher. I teach "+jerry.name+".";
        else
            str=pp.introduce()+" I am a Teacher. I don't teach "+jerry.name+".";
        return  str;
    }
}

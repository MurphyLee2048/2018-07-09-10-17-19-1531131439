package practice08;

public class Student extends Person{
    public Student(int personID, String name, int age, Klass klass) {
        super(personID, name, age);
        this.klass = klass;
    }

    Klass klass;

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        return super.introduce() + String.format(" I am a Student. I am at Class %d.", klass.getNumber());
    }


}

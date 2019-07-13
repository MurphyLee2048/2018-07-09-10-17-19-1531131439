package practice09;

public class Teacher extends Person {
    Klass klass;

    public Teacher(int personID, String name, int age) {
        super(personID, name, age);
    }

    public Teacher(int personID, String name, int age, Klass klass) {
        super(personID, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        if (klass == null) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        } else {
            return super.introduce() + String.format(" I am a Teacher. I teach Class %d.", klass.getNumber());
        }
    }

    public String introduceWith(Student student) {
        if (student.getKlass().getNumber() == this.klass.getNumber()) {
            return super.introduce() +  " I am a Teacher. I teach " + student.getName() + ".";
        }
        else {
            return super.introduce() +  " I am a Teacher. I don't teach " + student.getName() + ".";
        }
    }

}
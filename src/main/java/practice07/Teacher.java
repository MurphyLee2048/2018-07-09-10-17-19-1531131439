package practice07;

public class Teacher extends Person {
    private Klass klass;

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);

    }


    public Klass getKlass() {
        return klass;
    }

//    public String introduce() {
//        if (!klass) {
//
//        }
//        return super.introduce() + " I am a Teacher. " + "I teach Class " + klass;
//    }

    public String introduceWith(Student student) {
        if (student.getKlass() == klass) {
            return super.introduce() + " I am a Teacher. " + "I teach " + student.getName() + ".";
        }else {
            return super.introduce() + " I am a Teacher. " + "I don't teach " + student.getName() + ".";
        }
    }
}

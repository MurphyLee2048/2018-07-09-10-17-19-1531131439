package practice06;

public class Teacher extends Person{
    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);

    }

    public int getKlass() {
        return klass;
    }

    //>My name is Tom. I am 21 years old. I am a Teacher. I teach Class 2.
    private int klass;

    public String introduce() {
        return super.introduce() + " I am a Teacher. " + "I teach Class " + klass;
    }
}

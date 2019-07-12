package practice06;

public class Teacher extends Person{
    private int klass = -1;
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


    public String introduce() {
        if(klass == -1)
            return super.introduce() + " I am a Teacher. " + "I teach No Class." ;
        else
            return super.introduce() + " I am a Teacher. " + "I teach "+"Class "+klass+"." ;

    }
}
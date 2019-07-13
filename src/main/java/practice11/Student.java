package practice11;

public class Student extends Person{
    public Student(int personID, String name, int age, Klass klass) {
        super(personID, name, age);
        this.klass = klass;
    }

    private Klass klass;

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        if (klass.getLeader() != null && klass.getLeader().getName() == super.getName()) {
            return super.introduce() + " I am a Student. I am Leader of " + klass.getDisplayName() + ".";
        } else return super.introduce() + " I am a Student. I am at " + klass.getDisplayName() + ".";
    }


}
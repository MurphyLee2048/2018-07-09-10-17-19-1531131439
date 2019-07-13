package practice11;

import java.util.LinkedList;

public class Teacher extends Person implements ClassObservable {
    private LinkedList<Klass> classes = new LinkedList<Klass>();

    public Teacher(int personID, String name, int age, LinkedList<Klass> classes) {
        super(personID, name, age);
        this.classes = classes;
        for (Klass klass : classes) {
            klass.addObservable(this);
        }
    }

    public Teacher(int personID, String name, int age) {
        super(personID, name, age);
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }


    @Override
    public String introduce() {
        if (classes == null || classes.isEmpty()) {  // null是不存在，没有地址，size() == 0 是没有存放元素
            return String.format(super.introduce() + " I am a Teacher. I teach No Class.");
        }else {
            StringBuilder classesString = new StringBuilder();
            classes.stream().forEach(k -> classesString.append(String.valueOf(k.getNumber()) + ',' + ' '));
            return String.format(super.introduce() + " I am a Teacher." + " I teach Class %s.", classesString.toString().substring(0, classesString.length() - 2));
        }
    }

    public String introduceWith(Student student) {
        if (classes.contains(student.getKlass())) {
            return super.introduce() +  " I am a Teacher. I teach " + student.getName() + ".";
        }
        else {
            return super.introduce() +  " I am a Teacher. I don't teach " + student.getName() + ".";
        }
    }

    public boolean isTeaching(Student student) {
        if (classes.contains(student.getKlass())) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    // 重写ClassObservable接口的update方法
    public void update(String notification) {
        System.out.print(String.format("I am %s. I know %s\n", getName(), notification));
    }
}
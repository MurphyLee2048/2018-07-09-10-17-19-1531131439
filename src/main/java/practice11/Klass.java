package practice11;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Klass {
    private int number;
    private Student leader;
    private Student member;
    private List<Student> students = new ArrayList<Student>();
    private List<ClassObservable> observables = new ArrayList<>();

    public void addObservable (ClassObservable classObservable) {
        observables.add(classObservable);
    }

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public Student getLeader() {
        return leader;
    }

    public String getDisplayName() {
        return "Class " + number;
    }

    public void assignLeader(Student leader) {
        if (!students.contains(leader)){
            System.out.print("It is not one of us.\n");
        }else {
            this.leader = leader;
            leader.setKlass(this);
        }
        notifyTeachers();
    }

    public void appendMember(Student member) {
        students.add(member);
        this.member = member;
        member.setKlass(this);
        notifyTeachers();
    }

    public boolean isIn(Student student) {
        if (students.contains(student)) {
            return true;
        }else {
            return false;
        }
    }

    private void notifyTeachers() {
        String str;
        if (leader != member) {
            str = String.format("%s has joined %s.", member.getName(), getDisplayName());
        } else {
            str = String.format("%s become Leader of %s.", member.getName(), getDisplayName());
        }
        for (ClassObservable observable : observables) {
            observable.update(str);
        }
    }
}

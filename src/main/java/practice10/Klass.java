package practice10;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private Student leader;
    private List<Student> students = new ArrayList<Student>();

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

    public void assignLeader(Student student) {
        if (!students.contains(student)){
            System.out.print("It is not one of us.\n");
        }else {
            leader = student;
        }
    }

    public void appendMember(Student student) {
        students.add(student);
        student.setKlass(this);
    }

    public boolean isIn(Student student) {
        if (students.contains(student)) {
            return true;
        }else {
            return false;
        }
    }
}

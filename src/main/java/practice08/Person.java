package practice08;

public class Person {
    private int personID;
    private String name;
    private int age;

    public Person(int personID, String name, int age) {
        this.personID = personID;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String introduce() {
        return "My name is " + name + "." + " I am " + age + " years old.";
    }
}
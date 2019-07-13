package practice10;

import java.util.Objects;

public class Person {
    private int personID;
    private String name;
    private int age;

    public Person(int personID, String name, int age) {
        this.personID = personID;
        this.name = name;
        this.age = age;
    }

    @Override
    // override Object类下面的equals方法
    // assertThat().isEqualTo()里调用的是Object原生的equals方法
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return personID == person.personID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(personID);
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
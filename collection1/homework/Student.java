package collection1.homework;

import java.util.Objects;

public class Student {
    private int age;
    private String name;
    private String subjekt;



    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSubjekt() {
        return subjekt;
    }

    public void setSubjekt(String subjekt) {
        this.subjekt = subjekt;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(subjekt, student.subjekt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, subjekt);
    }

    @Override
    public String toString() {
        return "\n"+"Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", subjekt='" + subjekt + '\'' +
                '}';
    }
}

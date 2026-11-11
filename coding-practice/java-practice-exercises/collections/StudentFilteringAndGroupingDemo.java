package collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentFilteringAndGroupingDemo {
    public static void main(String[] args) {
        List<Student> stList = new ArrayList<>();
        stList.add(new Student("Mayank", 30, 90));
        stList.add(new Student("Twinkle", 29, 100));
        stList.add(new Student("Harshit", 26, 35));

        var list = stList.stream().filter(s -> s.marks > 40).sorted(Comparator.comparing(s -> s.name))
        .collect(Collectors.groupingBy(Student::getAge));

        list.entrySet().forEach(s -> System.out.println(s));
    }
}
class Student {
    String name;
    int age;
    int marks;

    public Student(String name, int age, int marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", marks=" + marks +
                '}';
    }
}

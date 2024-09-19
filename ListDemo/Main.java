package ListDemo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       List<Student> students = new ArrayList<Student>();
       students.add(new Student("Bob",19));
       students.add(new Student("Alice",20));
       students.add(new Student("Alice",25));

        Student student = students.get(1);
        System.out.println(student.name + " is " + student.age + " years old.");
    }
}

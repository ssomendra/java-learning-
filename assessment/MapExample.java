import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Student {

    private int id;
    private String name;
    private int marks;

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }
}

public class MapExample {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(101, "Rahul", 75));
        students.add(new Student(102, "Priya", 85));
        students.add(new Student(103, "Amit", 65));
        students.add(new Student(104, "Sneha", 90));

        // Extract only names using map()
        List<String> names = students.stream()
                                     .map(Student::getName)
                                     .collect(Collectors.toList());

        System.out.println("Student Names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
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

    public int getMarks() {
        return marks;
    }
}

public class FilterMapCollect {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(101, "Rahul", 75));
        students.add(new Student(102, "Priya", 55));
        students.add(new Student(103, "Amit", 82));
        students.add(new Student(104, "Sneha", 45));
        students.add(new Student(105, "Kiran", 90));

        // Filter + Map + Collect
        List<String> result = students.stream()
                .filter(student -> student.getMarks() > 60)
                .map(student -> student.getName())
                .collect(Collectors.toList());

        System.out.println("Students with Marks > 60:");
        System.out.println(result);
    }
}
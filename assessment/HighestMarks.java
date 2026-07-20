import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

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

public class HighestMarks {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(101, "Rahul", 75));
        students.add(new Student(102, "Priya", 88));
        students.add(new Student(103, "Amit", 95));
        students.add(new Student(104, "Sneha", 67));
        students.add(new Student(105, "Kiran", 91));

        Student topper = students.stream()
                .max(Comparator.comparing(Student::getMarks))
                .get();

        System.out.println("Topper Details");
        System.out.println("Name  : " + topper.getName());
        System.out.println("Marks : " + topper.getMarks());
    }
}   
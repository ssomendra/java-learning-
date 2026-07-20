import java.util.ArrayList;

class Student {

    private int id;
    private String name;
    private int marks;

    // Constructor
    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // Getter
    public int getMarks() {
        return marks;
    }

    // Display Student Details
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("----------------------");
    }
}

public class StudentFilter {

    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<Student> students = new ArrayList<>();

        // Add Students
        students.add(new Student(101, "Rahul", 75));
        students.add(new Student(102, "Priya", 58));
        students.add(new Student(103, "Amit", 82));
        students.add(new Student(104, "Sneha", 45));
        students.add(new Student(105, "Kiran", 67));

        System.out.println("Students with Marks Greater Than 60");

        // Filter Students
        for (Student s : students) {

            if (s.getMarks() > 60) {
                s.display();
            }
        }
    }
}
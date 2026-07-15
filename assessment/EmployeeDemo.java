class Employee {
    void calculateSalary() {
        System.out.println("Calculating employee salary");
    }
}

class Manager extends Employee {
    void calculateSalary() {
        System.out.println("Manager salary: 80000");
    }
}

class Developer extends Employee {
    void calculateSalary() {
        System.out.println("Developer salary: 60000");
    }
}

class Tester extends Employee {
    void calculateSalary() {
        System.out.println("Tester salary: 50000");
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {

        Employee e;

        e = new Manager();     
        e.calculateSalary();

        e = new Developer();
        e.calculateSalary();

        e = new Tester();      
        e.calculateSalary();
    }
}
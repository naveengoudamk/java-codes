class Employee {
    void calculateSalary() {
        System.out.println("Basic salary calculation");
    }
}

class Manager extends Employee {
    void calculateSalary() {
        System.out.println("Manager salary with bonus");
    }
}

public class TestEmployee {
    public static void main(String[] args) {
        Employee obj = new Manager();
        obj.calculateSalary();
    }
}
package ass12.t2;

class Employee {
    int id;
    String name;
    char dept;

    Employee(int id, String name, char dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(10, "Allen", 'A');
        System.out.println(e1.id);
        System.out.println(e1.name);
        System.out.println(e1.dept);
    }
}
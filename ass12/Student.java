package ass12;
class Student {
    int id;
    String name;
    char section;

    Student(int a, String b, char c) {
        id = a;
        name = b;
        section = c;
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "Rahul", 'A');
        System.out.println(s1.id);
        System.out.println(s1.name);
        System.out.println(s1.section);
    }
}

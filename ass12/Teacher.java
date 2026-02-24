package ass12;
class Teacher {
    int id;
    String name;
    char subjectCode;

    Teacher(int a, String b, char c) {
        id = a;
        name = b;
        subjectCode = c;
    }

    public static void main(String[] args) {
        Teacher t1 = new Teacher(5, "Meena", 'M');
        System.out.println(t1.id);
        System.out.println(t1.name);
        System.out.println(t1.subjectCode);
    }
}

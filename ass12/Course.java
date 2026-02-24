package ass12;

class Course {
    int id;
    String cname;
    char level;

    Course(int a, String b, char c) {
        id = a;
        cname = b;
        level = c;
    }

    public static void main(String[] args) {
        Course c1 = new Course(20, "Java Full Stack", 'B');
        System.out.println(c1.id);
        System.out.println(c1.cname);
        System.out.println(c1.level);
    }
}

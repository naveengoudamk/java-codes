package ass12.t2;
class Student {
    int sid;
    String sname;
    char sec;

    Student(int sid, String sname, char sec) {
        this.sid = sid;
        this.sname = sname;
        this.sec = sec;
    }

    public static void main(String[] args) {
        Student s1 = new Student(123, "Dinga", 'A');
        System.out.println(s1.sid);
        System.out.println(s1.sname);
        System.out.println(s1.sec);
    }
}

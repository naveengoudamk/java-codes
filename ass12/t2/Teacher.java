package ass12.t2;
class Teacher {
    int tid;
    String tname;
    char subject;

    Teacher(int tid, String tname, char subject) {
        this.tid = tid;
        this.tname = tname;
        this.subject = subject;
    }

    public static void main(String[] args) {
        Teacher t1 = new Teacher(5, "Meena", 'M');
        System.out.println(t1.tid);
        System.out.println(t1.tname);
        System.out.println(t1.subject);
    }
}


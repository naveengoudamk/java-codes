package ass12.t2;
class Course {
    int cid;
    String cname;
    char level;

    Course(int cid, String cname, char level) {
        this.cid = cid;
        this.cname = cname;
        this.level = level;
    }

    public static void main(String[] args) {
        Course c1 = new Course(30, "Full Stack", 'B');
        System.out.println(c1.cid);
        System.out.println(c1.cname);
        System.out.println(c1.level);
    }
}

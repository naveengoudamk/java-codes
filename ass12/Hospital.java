package ass12;
class Hospital {
    int id;
    String name;
    char ward;

    Hospital(int a, String b, char c) {
        id = a;
        name = b;
        ward = c;
    }

    public static void main(String[] args) {
        Hospital h1 = new Hospital(11, "CityCare", 'C');
        System.out.println(h1.id);
        System.out.println(h1.name);
        System.out.println(h1.ward);
    }
}

package ass12;
class Laptop {
    int id;
    String brand;
    char grade;

    Laptop(int a, String b, char c) {
        id = a;
        brand = b;
        grade = c;
    }

    public static void main(String[] args) {
        Laptop l1 = new Laptop(2, "Dell", 'A');
        System.out.println(l1.id);
        System.out.println(l1.brand);
        System.out.println(l1.grade);
    }
}

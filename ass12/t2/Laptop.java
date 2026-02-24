package ass12.t2;
class Laptop {
    int lid;
    String brand;
    char grade;

    Laptop(int lid, String brand, char grade) {
        this.lid = lid;
        this.brand = brand;
        this.grade = grade;
    }

    public static void main(String[] args) {
        Laptop l1 = new Laptop(2, "Dell", 'A');
        System.out.println(l1.lid);
        System.out.println(l1.brand);
        System.out.println(l1.grade);
    }
}

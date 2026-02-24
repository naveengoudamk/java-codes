package ass12.t2;
class Product {
    int pid;
    String pname;
    char category;

    Product(int pid, String pname, char category) {
        this.pid = pid;
        this.pname = pname;
        this.category = category;
    }

    public static void main(String[] args) {
        Product p1 = new Product(20, "Laptop", 'E');
        System.out.println(p1.pid);
        System.out.println(p1.pname);
        System.out.println(p1.category);
    }
}

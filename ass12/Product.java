package ass12;

class Product {
    int pid;
    String pname;
    char category;

    Product(int a, String b, char c) {
        pid = a;
        pname = b;
        category = c;
    }

    public static void main(String[] args) {
        Product p1 = new Product(10, "Laptop", 'E');
        System.out.println(p1.pid);
        System.out.println(p1.pname);
        System.out.println(p1.category);
    }
}

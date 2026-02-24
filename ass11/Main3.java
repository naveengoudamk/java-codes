package ass11;

class Laptop {
    void use() {
        System.out.println("Using Dell Laptop");
    }
}

class Shop {
    static void sell(Laptop l) {
        System.out.println("Shop: Laptop sold");
        l.use();
    }
}

class Customer {
    static void buy(Laptop l) {
        System.out.println("Customer: Buying laptop");
        Shop.sell(l);
    }
}

public class Main3 {
    public static void main(String[] args) {
        System.out.println("Main: Customer wants a laptop");

        Laptop l1 = new Laptop();
        Customer.buy(l1);
    }
}
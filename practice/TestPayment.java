class Payment {
    void pay() {
        System.out.println("General payment process");
    }
}

class CreditCard extends Payment {
    void pay() {
        System.out.println("Payment using Credit Card");
    }
}

public class TestPayment {
    public static void main(String[] args) {
        Payment obj = new CreditCard();
        obj.pay();
    }
}
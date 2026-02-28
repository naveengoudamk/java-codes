class Bank {
    void calculateInterest() {
        System.out.println("Bank interest is 5%");
    }
}

class SBI extends Bank {
    void calculateInterest() {
        System.out.println("SBI interest is 7%");
    }
}

public class TestBank {
    public static void main(String[] args) {
        Bank obj = new SBI();   // Upcasting
        obj.calculateInterest(); 
    }
}
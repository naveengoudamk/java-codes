package ass11;

class Medicine {
    void consume() {
        System.out.println("Taking medicine");
    }
}

class Pharmacy {
    static void give(Medicine m) {
        System.out.println("Pharmacy: Medicine provided");
        m.consume();
    }
}

class Patient {
    static void take(Medicine m) {
        System.out.println("Patient: Taking medicine from pharmacy");
        Pharmacy.give(m);
    }
}

public class Main4 {
    public static void main(String[] args) {
        System.out.println("Main: Patient is sick");

        Medicine m1 = new Medicine();
        Patient.take(m1);
    }
}
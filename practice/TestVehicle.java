class Vehicle {
    void start() {
        System.out.println("Vehicle starts normally");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike starts with self-start button");
    }
}

public class TestVehicle {
    public static void main(String[] args) {
        Vehicle obj = new Bike();
        obj.start();
    }
}
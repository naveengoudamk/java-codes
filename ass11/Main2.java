package ass11;

class Engine {
    void start() {
        System.out.println("Engine started");
    }
}

class Mechanic {
    static void repair(Engine e) {
        System.out.println("Mechanic: Repairing engine");
        e.start();
    }
}

class ServiceCenter {
    static void service(Engine e) {
        System.out.println("Service Center: Sending engine to mechanic");
        Mechanic.repair(e);
    }
}

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Driver: My car needs service");

        Engine e1 = new Engine();
        ServiceCenter.service(e1);
    }
}
package ass12;
class Car {
    int id;
    String model;
    char type;

    Car(int a, String b, char c) {
        id = a;
        model = b;
        type = c;
    }

    public static void main(String[] args) {
        Car c1 = new Car(1, "Honda", 'S');
        System.out.println(c1.id);
        System.out.println(c1.model);
        System.out.println(c1.type);
    }
}

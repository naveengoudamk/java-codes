package ass12.t2;
class Car {
    int cid;
    String model;
    char type;

    Car(int cid, String model, char type) {
        this.cid = cid;
        this.model = model;
        this.type = type;
    }

    public static void main(String[] args) {
        Car c1 = new Car(1, "Honda", 'S');
        System.out.println(c1.cid);
        System.out.println(c1.model);
        System.out.println(c1.type);
    }
}

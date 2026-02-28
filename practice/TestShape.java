class Shape {
    void area() {
        System.out.println("Calculating area...");
    }
}

class Circle extends Shape {
    void area() {
        System.out.println("Area of Circle = πr²");
    }
}

public class TestShape {
    public static void main(String[] args) {
        Shape obj = new Circle();
        obj.area();
    }
}
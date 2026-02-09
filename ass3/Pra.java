class Pra {

    // Area of Triangle
    static void areaTriangle(double base,double height) {
        
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }

    // Area of Square
    static void areaSquare( double side) {
        double area = side * side;
        System.out.println("Area of Square: " + area);
    }

    // Area of Rectangle
    static void areaRectangle(double length,double width ) {
         double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }

    // Area of Parallelogram
    static void areaParallelogram(double base,double height) {
        double area = base * height;
        System.out.println("Area of Parallelogram: " + area);
    }

    // Area of Trapezoid
    static void areaTrapezoid(double a,double b,double height ) {
        
        double area = 0.5 * (a + b) * height;
        System.out.println("Area of Trapezoid: " + area);
    }

    // Area of Circle
    static void areaCircle(double radius) {
         
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    // Area of Ellipse
    static void areaEllipse(double a,double b ) {
        
        double area = Math.PI * a * b;
        System.out.println("Area of Ellipse: " + area);
    }

    // Area of Sector
    static void areaSector(double radius,double angle) {
        
        double area = (Math.PI * radius * radius * angle) / 360;
        System.out.println("Area of Sector: " + area);
    }

    public static void main(String[] args) {
        areaTriangle(10,5);
        areaSquare(4);
        areaRectangle(8,6);
        areaParallelogram(7,5);
        areaTrapezoid(6,4,5);
        areaCircle(7);
        areaEllipse(5,3);
        areaSector(7,90);
    }
}
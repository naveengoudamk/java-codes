class Demo
{
    void circle(double r)
    {
        double res = Math.PI * r * r;
        System.out.println("Area of the circle: " + res);
    }

    void rect(int a, int b)
    {
        int res = a * b;
        System.out.println("Area of the rectangle: " + res);
    }

    void parl(int a, int b)
    {
        int res = a * b;
        System.out.println("Area of the parallelogram: " + res);
    }

    void trap(int a, int b, int h)
    {
        double res = 0.5 * (a + b) * h;
        System.out.println("Area of the trapezoid: " + res);
    }

    void tri(int h, int b)
    {
        double res = 0.5 * h * b;
        System.out.println("Area of the triangle: " + res);
    }

    void sqr(int a)
    {
        int res = a * a;
        System.out.println("Area of the square: " + res);
    }

    void ellip(int a, int b)
    {
        double res = Math.PI * a * b;
        System.out.println("Area of the ellipse: " + res);
    }

    void sect(int r, double theta)
    {
        double res = (Math.PI * r * r * theta) / 360;
        System.out.println("Area of the sector: " + res);
    }
}

public class Parea
{
    public static void main(String[] args)
    {
        Demo D1 = new Demo();

        D1.circle(10);
        D1.rect(15, 10);
        D1.parl(15, 10);
        D1.trap(15, 10, 10);
        D1.tri(15, 10);
        D1.sqr(15);
        D1.ellip(15, 10);
        D1.sect(15, 30);
    }
}

class Demo
{
    double circle()
    {
        double r = 10;
        double res = 3.14 * r * r ;
        return res;
    }
     double rect()
    {
        int a = 15;
        int b = 10;
        int res = a * b;
        return res;
    }
     double parl()
    {
        int a = 15;
        int b = 10;
        int res = a * b;
        return res;
    }
     double trap()
    {
        int a = 15;
        int b = 10;
        int h = 10;
        double res = 0.5*(a+b)*h;
        return res;
    }
     double tri()
    {
        int h = 15;
        int b = 10;
        double res =0.5 * h * b;
        return res;
    }
     double sqr()
    {
        int a = 15;
        int res = a * a;
        return res;
    }
     double ellip()
    {
        int a = 15;
        int b = 10;
        double res = 3.5 * a * b;
        return res;
    }
     double sect()
    {
        int r = 15;
        double theta = 30;
        double res = 3.14 * r * r * theta;
        return res;
    }
    

}

public class Area

{
    public static void main(String[] args) 
    {
        Demo D1 = new Demo();
        System.out.println("area of the circle : " + D1.circle());
        System.out.println("area of the rectangle " + D1.rect());
        System.out.println("area of the Parallelogram " + D1.parl());
        System.out.println("area of the Trapezoidal : " + D1.trap());
        System.out.println("area of the Triangle " + D1.tri());
        System.out.println("area of the square " + D1.sqr());
        System.out.println("area of the ellips : " + D1.ellip());
        System.out.println("area of the Sector " + D1.sect());

        
        

        

    }
    
}

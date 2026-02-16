class Demo
{
    void circle()
    {
        double r = 10;
        double res = 3.14 * r * r ;
        System.out.println("area of the circle :" + res);
    }
     void rect()
    {
        int a = 15;
        int b = 10;
        int res = a * b;
        System.out.println("area of the reactangle :" + res);
    }
     void parl()
    {
        int a = 15;
        int b = 10;
        int res = a * b;
        System.out.println("area of the paralleogram :" + res);
    }
     void trap()
    {
        int a = 15;
        int b = 10;
        int h = 10;
        double res = 0.5*(a+b)*h;
        System.out.println("area of the Trapezodal :" + res);
    }
     void tri()
    {
        int h = 15;
        int b = 10;
        double res =0.5 * h * b;
        System.out.println("area of the triangle :" + res);
    }
     void sqr()
    {
        int a = 15;
        int res = a * a;
        System.out.println("area of the square :" + res);
    }
     void ellip()
    {
        int a = 15;
        int b = 10;
        double res = 3.5 * a * b;
        System.out.println("area of the elipse :" + res);
    }
     void sect()
    {
        int r = 15;
        double theta = 30;
        double res = 3.14 * r * r * theta;
        System.out.println("area of the sector :" + res);
    }
    

}

public class Narea

{
    public static void main(String[] args) 
    {
        Demo D1 = new Demo();
        D1.circle();
        D1.rect();
        D1.parl();
        D1.trap();
        D1.tri();
        D1.sqr();
        D1.ellip();
        D1.sect();
    }
    
}

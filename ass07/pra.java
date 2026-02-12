class Circle 
{
    void area()
    {
        int r = 10;
        double area = 3.14 * r * r;
        System.out.println("area of the circle :" + area);
    }
}
class Ellipse 
{
    int a = 10;
    int b = 15;
    void area()
    {
        double area = 3.14 * a * b;
        System.out.println("area of Ellipse :" + area);
        
    }
}
class Rect 
{
    void area()
    {
        int b = 10;
        int h = 20;
        int res = b * h;
        System.out.println("area of the recangle : " + res);
    }
}
public class Trap 
{
    void area()
    {
        int a = 10;
        int b = 10;
        int h = 10;
        double res = 0.5 * (a + b) * h;
        System.out.println(res);
    }
}
class parall 
{
    void area()
    {
        int h = 10;
        int b = 10;
        double res = b * h ;
        System.out.println(" area of parallellogram :" + res);
    }
}
public class Tri 
{
    void area()
    {
        int b = 10;
        int h =10;
        double area = 0.5 * b * h;
        System.out.println(" area of the triangle :" + area);
    }
}
class Sector
{
    void area()
    {
        int a = 10;
        int b = 10;
        double area = 3.14 * a * b;
        System.out.println("area of the :" + area); 
    }
}
class Square
{
    void area()
    {
        int a = 10;
        int area = a * a;
        System.out.println("are of the Square :" + area);
    }
}
public class pra 
{
    public static void main(String[] args) 
    {
        new Circle().area();
        new Ellipse().area();
        new Rect().area();
        new Sector().area();
        new Square().area();
        new Trap().area();
        new Tri().area();
        new parall().area();
        
    }
    
}

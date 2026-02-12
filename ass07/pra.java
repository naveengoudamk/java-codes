class Circle 
{
    void area(int r )
    {
    
        double area = 3.14 * r * r;
        System.out.println("area of the circle :" + area);
    }
}
class Ellipse 
{
   
    void area( int a , int b )
    {
        double area = 3.14 * a * b;
        System.out.println("area of Ellipse :" + area);
        
    }
}
class Rect 
{
    void area( int b , int h )
    {
        
        int res = b * h;
        System.out.println("area of the recangle : " + res);
    }
}
class Trap 
{
    void area(int a , int b , int h)
    {
        double res = 0.5 * (a + b) * h;
        System.out.println(res);
    }
}
class parall 
{
    void area(int h , int b)
    {
        double res = b * h ;
        System.out.println(" area of parallellogram :" + res);
    }
}
class Tri 
{
    void area(int b , int h)
    {
        
        double area = 0.5 * b * h;
        System.out.println(" area of the triangle :" + area);
    }
}
class Sector
{
    void area(int a , int b)
    {
        
        double area = 3.14 * a * b;
        System.out.println("area of the :" + area); 
    }
}
class Square
{
    void area(int a)
    {
   
        int area = a * a;
        System.out.println("are of the Square :" + area);
    }
}
class pra 
{
    public static void main(String[] args) 
    {
        new Circle().area(10);
        new Ellipse().area(10 , 15);
        new Rect().area(10 , 20);
        new Sector().area(10 ,10);
        new Square().area(10);
        new Trap().area(10 , 10 ,10 );
        new Tri().area(10 ,10);
        new parall().area(10 ,10);
        
    }
    
}

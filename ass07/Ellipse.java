public class Ellipse 
{
    int a = 10;
    int b = 15;
    void area()
    {
        double area = 3.14 * a * b;
        System.out.println("area of Ellipse :" + area);
        
    }
    public static void main(String [] args)
    {
        new Ellipse().area();
    }

    
}

class Sample 
{
    static double area ()
    {
        double r = 10;
        double res = 3.14 * r * r;
        System.out.println("area of the circle : " + res);

        return res;
    }

}

public class Circle 
{
    public static void main(String [] args)
    {
        Sample.area();
    }

    
}

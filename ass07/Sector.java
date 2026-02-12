public class Sector
{
    void area()
    {
        int a = 10;
        int b = 10;
        double area = 3.14 * a * b;
        System.out.println("area of the :" + area); 
    }
    public static void main(String[] args) {
        new Sector().area();
    }
}

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
    public static void main(String[] args) {
        new Trap().area();
    }
    
}

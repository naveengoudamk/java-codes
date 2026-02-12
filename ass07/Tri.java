public class Tri 
{
    void area()
    {
        int b = 10;
        int h =10;
        double area = 0.5 * b * h;
        System.out.println(" area of the triangle :" + area);
    }
    public static void main(String[] args) {
        new Tri().area();
    }
}

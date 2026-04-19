public class Triangle 
{
    static void area(Object[] a)
    {
        for(int i = 0; i < a.length; i += 2)
        {
            int b = (int)a[i];
            int h = (int)a[i + 1];
            double res = 0.5 * b * h;
            System.out.println("Triangle Area: " + res);
        }
    }

    public static void main(String[] args) 
    {
        Object[] arr = {4,6, 5,3};
        area(arr);
    }
}
public class Square 
{
    static void area(Object[] a)
    {
        for(int i = 0; i < a.length; i++)
        {
            int s = (int)a[i];
            int res = s * s;
            System.out.println("Square Area: " + res);
        }
    }

    public static void main(String[] args) 
    {
        Object[] arr = {2,4,6,8};
        area(arr);
    }
}
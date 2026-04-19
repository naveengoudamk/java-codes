public class Rectangle 
{
    static void area(Object[] a)
    {
        for(int i = 0; i < a.length; i += 2)
        {
            int l = (int)a[i];
            int b = (int)a[i + 1];
            int res = l * b;
            System.out.println("Rectangle Area: " + res);
        }
    }

    public static void main(String[] args) 
    {
        Object[] arr = {4,5, 6,2, 3,7}; // (l,b) pairs
        area(arr);
    }
}
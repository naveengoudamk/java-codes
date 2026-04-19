public class Circle 
{
    static void area(Object [] a)
    {
        for(int i = 1; i<a.length; i++)
        {
            int r = (int)a[i];
            double pi = 3.14;
            double res = pi * r * r;
            System.out.println(res+" ");
        }
    }
    public static void main(String[] args) 
    {
        Object [] arr = {5,2,7,1,9};
        area(arr);
        
    }
    
}

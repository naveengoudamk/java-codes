public class square{
    public static double area_of_square(double s )
        {
        
        double res = s*s;
		return res;
        
    }
    public static void main(String [] args)
    {
       double x = area_of_square(10);
	   System.out.println(x);
    }
}
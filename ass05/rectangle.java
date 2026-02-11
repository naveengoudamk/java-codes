public class rectangle{
    public static double area_of_rectangle(double w , double h )
        {
        
        double res = w*h;
		return res;
        
    }
    public static void main(String [] args)
    {
       double x = area_of_rectangle(2,5);
	   System.out.println(x);
    }
}
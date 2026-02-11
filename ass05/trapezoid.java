public class trapezoid{
    public static double area_of_trapezoid(double a , double b ,  double h )
        {
        
        double res = 0.5*(a+b)*h;
		return res;
        
    }
    public static void main(String [] args)
    {
       double x = area_of_trapezoid(5,10,2);
	   System.out.println(x);
    }
}
public class triangle {
    public static double area_of_triangle(double b , double h )
        {
        
        double res = 0.5*b*h;
		return res;
        
    }
    public static void main(String [] args)
    {
       double x = area_of_triangle(10,5);
	   System.out.println(x);
    }
}
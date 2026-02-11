public class circle{
    public static double area_of_circle( double r)
        {
        

        double res = 3.142*r*r;
		return res;
        
    }
    public static void main(String [] args)
    {
      double x = area_of_circle(10);
	   System.out.println(x);
    }
}

public class ellipse{
    public static double area_of_ellipse( double a , double b )
        {

        double res = 3.142*a*b;
		return res;
       
    }
    public static void main(String [] args)
    {
       double x =  area_of_ellipse(10,2);
	   System.out.println(x);
    }
}
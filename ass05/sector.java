public class sector{
    public static double area_of_sector(  double a , double theata )
        {

        double res = 3.142*a*a*theata;
		return res;
        
    }
    public static void main(String [] args)
    {
       double x = area_of_sector(5,30);
	   System.out.println(x);
    }
}


class demo
{
	static void area_of_sector(  double a , double theata )
        {

        double res = 3.142*a*a*theata;
        System.out.println(res);
    }
}



public class zsector{
    public static void main(String [] args)
    {
       demo.area_of_sector(5,30);
    }
}
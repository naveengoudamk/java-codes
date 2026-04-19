package mar18ass;

public class Mobile 
{
    int cost ;
    String brand ;
    String color;

    Mobile(int cost , String brand ,String  color)
    {
        this.brand=brand;
        this.color=color;
        this.cost=cost;
    }
    public boolean equals(Object obj)
    {
        Mobile m2 = (Mobile)obj;
        return this.cost==m2.cost; 
    }
    public static void main(String[] args) 
    {
        Mobile m1 = new Mobile(1000, "vivo", "blue");
        Mobile m2 = new Mobile(1000, "Apple", "White");

        if (m1.equals(m2))
        {
            System.out.println("Same cost");
        }
        else
        {
            System.out.println("Different Cost");
        }
        
    }
    
}

package ass11;

class factorys
{
    void tiers()
    {
        System.out.println(" MRF tiers ");
    }
}
class dealer
{
    static void stock(factorys f3)
    {
        System.out.println(" dealer : mrf tiers in stock ");
        f3.tiers();
    }
}
class garage
{
    static void tier(factorys f2)
    {
        System.out.println("garage : i have to change tiers");
        dealer.stock(f2);
    }
}
public class Driver 
{
    public static void main(String[] args) 
    {
        System.out.println(" driver : my car got punchered change tier ");

        factorys f1 = new factorys();

        garage.tier(f1);
        
    }
    
}

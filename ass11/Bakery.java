package ass11;
class Industry
{
    void Cake()
    {
        System.out.println("The Birthdaty Cake is Ready");
    }
}
class Wholesaler
{
    static void bigcake( Industry I3)
    {
        I3.Cake();

    }
}
class suplier
{
    static void onecake(Industry I2)
    {
        Wholesaler.bigcake(I2);

    }
}

public class Bakery 
{
    public static void main(String[] args) 
    {
        Industry I1 = new Industry();
        System.out.println(" i want cake");

        suplier.onecake(I1);
        
    }

    
}

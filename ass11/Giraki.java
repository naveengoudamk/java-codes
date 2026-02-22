package ass11;

class Rack
{
    void cloth()
    {
        System.out.println("only Ramraj");
    }
}
class owner
{
    static void lungis(Rack R3)
    {
        R3.cloth();

    }
}
class ClothAnna
{
    static void lungis(Rack R2)
    {
        owner.lungis(R2);

    }
}
public class Giraki 
{
    public static void main(String[] args) {
        System.out.println("i want lungis");
        Rack R1 = new Rack();

        ClothAnna.lungis(R1);
    }
    
}

package ass11;

class Factory
{
    void Shoe()
    {
        System.out.println("puma Shoe");
    }
}
class Supplier
{
    static void needshoe(Factory F3)
    {
        F3.Shoe();
    }
}
class Shop
{
    static void stack(Factory F2)
    {
        Supplier.needshoe(F2);
    }
}
public class Cusomer
{
    public static void main(String[] args) 
    {
        Factory F1 = new Factory();

        Shop.stack(F1);
        
    }

    
}

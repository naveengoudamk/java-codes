package ass11;


class factory
{
    void smartphone()
    {
        System.out.println("The IPHONE 18 PRO ");

    }

}
class importer
{
    static void stock(factory f3)
    {
        f3.smartphone();

    }

}
class retail
{
    static void needphone(factory f2)
    {
        importer.stock(f2);

    }
    
}
class Electrician 
{
    public static void main(String[] args) 
    {
        System.out.println("i want new phone");
        factory f1 = new factory();

        retail.needphone(f1);
        
    }
    
}

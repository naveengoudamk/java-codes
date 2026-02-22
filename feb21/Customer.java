package feb21;

class Customer 
{

    int x = 10;
    static void disp(Customer S2)
    {
        System.out.println("after reference valued passed" +S2.x);
    }
    public static void main(String[] args) 
    {
        Customer S1 = new Customer();

        System.out.println(S1.x);
        
        disp(S1);


        
    }
    
}

package Inheritence;

class Sample1
{
    int c = 10;
}
class Demo1 extends Sample1
{
    void test()
    {
        System.out.println("it is demo extends of Smaple");
    }
}
public class Single 
{
    public static void main(String[] args) 
    {
        Demo1 D1 = new Demo1();
        D1.test();
        System.out.println(D1.c);

        
    }
    
}

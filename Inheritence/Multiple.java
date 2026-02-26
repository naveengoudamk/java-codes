package Inheritence;

class sample3
{
    int x = 10;
}
class Demo3 extends sample3
{
    int y = 20;
}
class Tester3 extends sample3
{
    int z = 30;

}
public class Multiple
{
    public static void main(String[] args) {
        System.out.println("herirical example");   
        Demo3 D3 = new Demo3();
        Tester3 T3 = new Tester3();

        System.out.println("demo output");
        System.out.println(D3.y);
        System.out.println(D3.x);
        System.out.println("tester output");
        System.out.println(T3.x);
        System.out.println(T3.z);
        
    }
    
    
}

package Inheritence;

import javax.sound.sampled.SourceDataLine;

class Sample
{
    int x = 10 ;
}
class Demo extends Sample
{
    void cool()
    {
        System.out.println("it is demo print");
    }
}
class Tester extends Demo
{
    int y = 20;
}
public class Multilevel 
{
    public static void main(String[] args) 
    {
            Tester T1 = new Tester();
            T1.cool();
            System.out.println(T1.x);
            System.out.println(T1.y);
        
    }
    
}

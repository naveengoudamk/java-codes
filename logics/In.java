import java.util.Scanner;
public class In 
{
    public static void main(String[] args) 
    {
        Scanner S1 = new Scanner(System.in);
        System.out.println("enter the first element :");
        int a = S1.nextInt();

        System.out.println("Enter the Second elecent :");
        int b = S1.nextInt();

        int res = a + b;

        System.out.println("The addition valueis " + res);

        
    }
}

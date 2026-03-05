
package LOGICS_CODES;
import java.util.Scanner;
public class Logi 
{
    public static void main(String[] args) // with using temp swap
    // {
    //         int a = 10 , b = 20;
    //         System.out.println( "a:" + a + "b:" + b);
    //         int temp = a ;
    //                 a = b;
    //                 b = a;
    //         System.out.println("updated a: " + a +  "b:" + b );   
    // }

    //-----------------------------------------------------------------------------
    // {
    //     int a = 10 , b= 20 ;
    //     System.out.println("old values a:" + a + "b:" +b );
    //     a = a + b; // 10+ 20 = 30 = a
    //     b = a - b; // a = 30 , a-b = 10 = b
    //     a = a - b; // a = 30 , a- b = 20 = a
    //         System.out.println("new values a :" +a + " b:" + b);
    // }
    //-----------------------------------------------------------------------------
    //
    // {
    //     int [] arr = {1,2,3,4,5};
    //     String [] str = {"na" , "ve" , "en"};
    //     char [] chr = {'n' ,'a' , 'v' , 'i'};
    //     for(int i = 0 ; i < arr.length; i++)
    //     {
    //         System.out.println(arr[i]);
    //     }
    //     for(int i = 0; i<str.length; i++)
    //     {
    //         System.out.println(str[i]);
    //     }
    //     for(int i =0 ; i < chr.length; i ++)
    //     {
    //         System.out.println(chr[i]);
    //     }
    // }
    //-----------------------------------------------------------------------------
    // {
    //     Scanner sc = new Scanner(System.in);

    //     System.out.println("Enter size of array:");
    //     int n = sc.nextInt();

    //     int[] a = new int[n];

    //     System.out.println("Enter the values:");

    //     for(int i = 0; i < n; i++) {
    //         a[i] = sc.nextInt();
    //     }

    //     System.out.println("Elements of array:");

    //     for(int i = 0; i < a.length; i++) {
    //         System.out.println(a[i]);
    //     }
    // }
     //-----------------------------------------------------------------------------
    //revere the string with inbuilt function 
    // {
    //     String str  = "java";

    //     String res = " ";

    //     for(int i = str.length()-1; i>=0; i--)
    //     {
    //         res = res + str.charAt(i);
            
    //     }
    //     System.out.println(res);

    // }
     //-----------------------------------------------------------------------------
    //revere the string without using inbuilt function 
    // {
    //     String s = "Naveen";
    //     String r = "";

    //     char [] x = s.toCharArray();
    //     int i =0 , j = x.length-1;
    //     while(i<j)
    //     {
    //         char temp = x[i];
    //         x[i] = x[j];
    //         x[j] = temp ;
    //         i++;
    //         j--;
    //     }
    //     System.out.println(x);

    // }
    //-----------------------------------------------------------------------------
    //chek the given string is pallindorme without using inbuilt function

    // {
    //     String s = "level";

    //     String res = "";

    //     char[] x = s.toCharArray();
    //     int i=0 , j = x.length-1;
    //     while (i<j) 
    //     {
    //         if(x[i] != x[j])
    //         {
    //             System.out.println("not a paliindrome");
    //             return;
    //         }
    //         i++;
    //         j--;

            
    //     }
    //     System.out.println("the given string is pallindrome");


    // }
    //-----------------------------------------------------------------------------
    //chek the given string is pallindorme with using inbuilt function
    // {
    //     String s = "Level";
    //     String res = "";

    //     for(int i = s.length()-1; i>=0 ; i--)
    //     {
    //         res = res + s.charAt(i);
    //     }
    //     if(s.equalsIgnoreCase(res))
    //     {
    //         System.out.println("the given string is pallidrome");
    //     }
    //     else
    //     {
    //         System.out.println("not a pallindrome");
    //     }
    // }
        //-----------------------------------------------------------------------------
    //reverse the given sentence 
    // {
    //     String s = "HI HOW ARE YOU";

    //     String [] x = s.split(" ");
    //     for(int i = x.length-1; i>=0 ; i--)
    //     {
        
    //         System.out.print(x[i] + " ");

    //     }

    // }
            //-----------------------------------------------------------------------------
    //reverse each word
    static String rev(String a)
    {
        String rew = "";
        for(int i = a.length()-1 ; i>=0; i--)
        {
            rew = rew + a.charAt(i);
            
            
        }
        return rew;
    }
    {
        String s = "Hi HOW are you";

        String [] x = s.split(" ");
        for(int i = x.length-1; i>=0; i--)
            {
                System.out.print(x[i] + " ");
            } 

    }




    
    


}

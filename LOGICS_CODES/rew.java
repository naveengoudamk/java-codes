
package LOGICS_CODES;

// public class rew 
// {
//     static String rev(String a)
//     {
//         String res = "";
//         for (int i = a.length() - 1; i >= 0; i--)
//         {
//             res = res + a.charAt(i);
//         }
//         return res;
//     }

//     public static void main(String[] args) 
//     {
//         String str = "HI HELLO";
//         System.out.println("Original String: " + str);

//         String[] S = str.split(" ");

//         for(int i = 0; i < S.length; i++)
//         {
//             System.out.print(rev(S[i]) + " ");
//         }
//     }
// }

public class rew
{
    public static void main(String[] args) 
    {
        String Str = "HI HELLO";
        System.out.println(Str);
        String [] S = Str.split(" ");
        for(int i = S.length-1; i>=0; i--){
            System.out.println(S[i] + "");
        }  
    }
}
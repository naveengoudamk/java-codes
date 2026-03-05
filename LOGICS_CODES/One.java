// package LOGICS_CODES;

// public class One {
//     static String rev(String a)
//     {
//         String rew = "";
//         for(int i = a.length()-1 ; i>=0; i--)
//         {
//             rew = rew + a.charAt(i);
            
            
//         }
//         return rew;
//     }
//     public static void main(String[] args) {
//     {
//         String s = "Hi HOW are you";

//         String [] x = s.split(" ");
//         for(int i = x.length-1; i>=0; i--)
//             {
//                 System.out.print(x[i] + " ");
//             } 

//     }
    
// }
// }
package LOGICS_CODES;

public class One {

    static String rev(String a)
    {
        String rew = "";
        for(int i = a.length()-1; i >= 0; i--)
        {
            rew = rew + a.charAt(i);
        }
        return rew;
    }

    public static void main(String[] args) {

        String s = "Hi HOW are you";

        String[] x = s.split(" ");

        for(int i = 0; i < x.length; i++)
        {
            System.out.print(rev(x[i]) + " ");
        }
    }
}

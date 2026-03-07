package LOGICS_CODES;

public class Day 
{
    public static void main(String[] args) {
    // String str = "mEtHoD";
    // System.out.println(str); // do it  -Hi Hello How Are You 
    // String res = "" ; 
    // for(int i=0 ; i<str.length(); i++)
    // {
    //     char ch = str.charAt(i);
    //     if(ch>'A' && ch<'Z')
    //     {
    //         // res = res+(char)(ch+32);
    //         res = res+ch;
    //     }
    //     else
    //     {
    //         res = res+ch;
    //         // res = res+(char)(ch-32);
    //     }
    // }System.out.println(res);
    // String str = "Method";
    // String res = "";
    // for(int i = 0 ; i<str.length(); i++)
    // {
    //     char ch = str.charAt(i);
    //     if(ch>'A' && ch<'Z')
    //     {
    //         res = res+(char)(ch+32);
    //     }
    //     else{
    //         res = res+ch;
    //     }
        
    // }
    // System.out.println(res);
    String s ="hi hello how are you";
    String [] str =s.split(" ");
    for(int i = 0 ; i<str.length; i++)
    {
        char first = (char)(str[i].charAt(0)-32);
        System.out.print(first + str[i].substring(1)+" ");

    }

}

        
    

    
}

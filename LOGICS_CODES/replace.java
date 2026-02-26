package LOGICS_CODES;

import javax.annotation.processing.SupportedOptions;
import javax.print.DocFlavor.STRING;

public class replace 
{
    static void singleWord()
    {
        System.out.println("Single chatacter exhange (old word to new word)");
        String S = "wel coma";
        System.out.println(S);
        System.out.println(S.replace("a" , "e"));
    }
    static void second()
    {
        System.out.println("word exhange (old word to new word)");
        String S = "GOOD Morning" ;
        System.out.println(S);
        System.out.println(S.replace("Morning", "MORNING"));
    }
    static void Third()
    {
        System.out.println("removeing space from old sentence to new sentence ");
        String S = "Good               Morning              sir      ";
        System.out.println(S);
        System.out.println(S.replaceAll(" ", ""));
    }
    static void Fourth()
    {
        System.out.println("Remove Number from given String");
        String S = "Goo54d234 Mo434rnin3453g";
        System.out.println(S);
        System.out.println(S.replaceAll("[0-9]" , ""));
    }
    static void Fifth()
    {
        System.out.println("Remove Upper character from String ");
        String S = "GooOODd MoORrningNNGJJFVDDHBCJk";
        System.out.println(S);
        System.out.println(S.replaceAll("[A-Z]" , ""));
    }
    static void Six()
    {

        System.out.println("Remove lower character from String ");
        String S = "GooOODd MoORrningNING";
        System.out.println(S);
        System.out.println(S.replace("[a-z]" ,""));

    }
    static void Seven()
    {
        System.out.println("to remove upper case and Numbers ");
        String S = "GooO4688463ODd MoORrningNNGJ4566JFVDD335566H199235BCJk";
        System.out.println(S);
        System.out.println(S.replaceAll("[A-Z],[0-9]" , ""));
    }
    static void Eight()
    {
        System.out.println("only lower case ");
        String S = "GooO4688463ODd MoORrningNNGJ4566JFVDD335566H199235BCJk";
        System.out.println(S);
        System.out.println(S.replaceAll("[^a-z]" , ""));

    }
    static void Nine()
    {
        System.out.println("only number  ");
        String S = "GooO4688463ODd MoORrningNNGJ4566JFVDD335566H199235BCJk";
        System.out.println(S);
        System.out.println(S.replaceAll("[^0-9]" , ""));
    }
    static void Ten()
    {
        
    }
    public static void main(String[] args) 
    {
        // singleWord();
        // second();
        // Third();
        // Fourth();
        Fifth();
        Six();
        Seven();
        Eight();
        Nine();


        
    }   
}

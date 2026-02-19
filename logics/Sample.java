package logics;

import java.util.Scanner;
class Sample
{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        System.out.println("enter value of a :" );
        int a = S.nextInt();

        System.out.println("enter value of b:");
        int b = S.nextInt();

        int res = a+b;
        System.out.println("added value is :" + res);
    }


}
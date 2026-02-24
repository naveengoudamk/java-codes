package logics.out.production.logics.logics.ass;
public class ifelesestatement {
    public static void main(String[] args) {
        int a = 10;
        if (a%2==0){
            System.out.println("the number is even");
        }
        else{
            System.out.println("the number is odd");
        }


        if (a>0){
            System.out.println("the number is postive");
        }
        else{
            System.out.println("the number is negative");
        }

        int age = 18;
        if(age>18){
            System.out.println("the person is adult");
        }
        else{
            System.out.println("the person is minor");
        }

        int x=10,y=12;
        if(x>y){
            System.out.println("the first number is greater ");
        }
        else {
            System.out.println("the second number is greater");
        }

        if(a%2==0){
            System.out.println("the number is divisible by 2");
        }
        else{
            System.out.println("the number is not divisible by 2");
        }

        int year = 2100;
        if(year%100==0){
            System.out.println("the year is century");
        }
        else{
            System.out.println("the year is not century");
        }

        int marks = 40;
        if(marks>35){
            System.out.println("the student is passed");
        }
        else {
            System.out.println("the student is failed ");
        }

        int temp = 35;
        if (temp>30){
            System.out.println("the temperature is hot");
        }
        else{
            System.out.println("the temperature is cold");
        }


    }
}
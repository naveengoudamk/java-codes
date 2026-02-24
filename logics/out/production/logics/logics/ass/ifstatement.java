package logics.out.production.logics.logics.ass;
public class ifstatement {
    public static void main(String[] args) {
        int a =20;
        if(a>0){
            System.out.println("the number is postive");
        }

        if (a%2==0){
            System.out.println("the number is even");
        }

        int age =21;
        if (age>18){
            System.out.println("the person is eligible to vote");
        }

        if (a%5==0){
            System.out.println("the number is divisble by 5");
        }

        if (a%10 == 0){
            System.out.println("the number is divisble by 10");
        }

        char ch = 'A';
        if (ch >='A'&& ch <='Z'){
            System.out.println("the character is upper case letter");
        }

        int marks = 95;
        if (marks > 90){
            System.out.println("the student has scored above 90");
        }

        int num =120;
        if (num>=100){
            System.out.println("the number is 3 digit number");
        }

        int x=10 , y =20;
        if (x==y){
            System.out.println("the two number are equal");
        }

        String A = "admin";
        if (A=="admin"){
            System.out.println("the entered password is admin");
        }
    }
}
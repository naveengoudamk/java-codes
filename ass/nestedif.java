package ass;

public class nestedif {
    public static void main(String[] args) {

        //1st
        int num=10;
        if(num>0){
            if(num%2==0){
                System.out.println("the number is postive and even");
            }
        }

        //2d
        int marks=89;
        if(marks>35){
            if(marks>85){
                System.out.println("student passed and got distinction");
            }
        }

        //3rd
        char ch = 'a';
       
        if(ch>='a'&&ch<='z' || ch>='A'&&ch<='Z'){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                System.out.println("the character is a vowel");
            }
            else{
                System.out.println("the character is a consonant");
            }
        }
        else{
            System.out.println("the character is not an alphabet");
        }
//4th
        int age = 25;
        String citinebrship = "indian";
        if(age>18){
            if(citinebrship=="indian"){
                System.out.println("the person is eligible to vote");
            }
            else{
                System.out.println("the person is not eligible to vote");
            }
        }


        //5th
        String moblie="unlocked";
        String password="1234";
        if(moblie=="unlocked"){
            if(password=="1234"){
                System.out.println("the password is correct");
            }
            else{
                System.out.println("the password is incorrect");
            }
        }

        //6th
        int a=10;
        if(a%2==0){
            if(a%4==0){
                System.out.println("the number is divisible by 4");
            }
            else{
                System.out.println("the number is not divisible by 4");
            }
        }

        //7th
        int sal=6000;
        int exp=7;
        if(sal>5000){
            if(exp>5){
                System.out.println("the employee is eligible for promotion");
            }
            else{
                System.out.println("the employee is not eligible for promotion");
            }
        }

       
        





 

    }    
}
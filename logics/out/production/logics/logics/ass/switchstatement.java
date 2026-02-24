package logics.out.production.logics.logics.ass;
public class switchstatement {
    public static void main(String[] args) {

        int day = 3;
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }

        //2
        int month = 5;
        switch(month){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month");
        }

        //3rd basic calculator
        int num1 = 10;
        int num2 = 5;
        char operator = '+';
        switch(operator){
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                if(num2!=0){
                    System.out.println(num1 / num2);
                }
                else{
                    System.out.println("Cannot divide by zero");
                }
                break;
            default:
                System.out.println("Invalid operator");
        }

        //4th grade description
        char grade = 'B';
        switch(grade){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Poor");
                break;
            default:
                System.out.println("Invalid grade");
        }
        //5 tye of traffic light
        String traffic_light = "Green";
        switch(traffic_light){
            case "Red":
                System.out.println("Stop");
                break;
            case "Yellow":
                System.out.println("Ready");
                break;
            case "Green":
                System.out.println("Go");
                break;
            default:
                System.out.println("Invalid traffic light");
        }




        //6th type of vehicle by number of wheels
        int wheels = 4;
        switch(wheels){
            case 2:
                System.out.println("Bike");
                break;
            case 4:
                System.out.println("Car");
                break;
            case 6:
                System.out.println("Truck");
                break;
            default:
                System.out.println("Invalid number of wheels");
        }
        //vowel checker
        char ch = 'a'; 
        switch(ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("The character is a vowel");
                break;
            default:
                System.out.println("The character is a consonant");
        }
    
    }
}
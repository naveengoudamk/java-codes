package practice;
class Employee
{
    String detail(String name , char sec , int no)
    {
        String det = name + " " + sec +" " + no ;
        return det;
    }

}
// class Sector
// {
//     double area(double r , double a)
//     {
//         double res = 3.14 * r * a ;
//         return res;
//     }

// }
class One
{
    public static void main(String[] args) {
        // double x = new Sector().area(10,12);
        // System.out.println(x);
        // String S = new Employee().detail("Navi", 'A' ,10 );
        Employee S = new Employee();
        System.out.println( "adress of the reference variable will print here " + S);
    }
}
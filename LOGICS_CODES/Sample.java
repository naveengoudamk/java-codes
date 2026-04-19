class Sample{
    public static void main(String args{})
{
            int a = 10 , b = 20;
            System.out.println( "a:" + a + "b:" + b);
            int temp = a ;
                    a = b;
                    b = a;
            System.out.println("updated a: " + a +  "b:" + b );   
    }
package ass;
public class swap {
    static void swap2num(){
        System.out.println("Swap 2 number using temp");
        int a=2;
        int b=3;
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
        
    }
    static void swap3num(){
        System.out.println("swap 3 number using temp");
        int a=2;
        int b=3;
        int c=5;
        int temp;
        temp=a;
        a=b;
        b=c;
        c=temp;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    static void swap2wotemp(){
        System.out.println("swap 2 number without temp");
        int a=2;
        int b=3;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);
    }
    static void swap3wotemp(){
        System.out.println("swap 3 number without temp");
        int a=2;
        int b=3;
        int c=5;
        a=a+b+c;
        b=a-b-c;
        c=a-b-c;
        a=a-b-c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    static void swapwoas(){
        System.out.println("swap 2 number without addition and subtraction");
        int a=2;
        int b=3;
        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println(a);
        System.out.println(b);

    }
    static void swap3woas(){
        System.out.println("swap 3 number without addition and subtraction");
        int a=2;
        int b=3;
        int c=5;
        a=a*b*c;
        b=a/b/c;
        c=a/b/c;
        a=a/b/c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }


    public static void main(String[] args) {
        swap2num();
        swap3num();
        swap2wotemp();
        swap3wotemp();
        swapwoas();
        swap3woas();

        
        
    }

}
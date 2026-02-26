public class calc {
    void add(int a, int b){
        System.out.println(a+b);
    }
    void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public static void main(String[] args) {
        calc s=new calc();
        s.add(1,5);
        s.add(2,5,2);
    }
}

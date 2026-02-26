public class pri {
    void disp(int a){
        System.out.println("integer is "+a);
    }
    void disp(String s){
        System.out.println("String is "+s);
    }
    public static void main(String[] args) {
        pri p=new pri();
        p.disp(10);
        p.disp("Hello");
    }
}

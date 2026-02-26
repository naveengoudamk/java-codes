public class std {
    void st(int age){
        System.out.println("Age is "+age);
    }
    void st(String name){
        System.out.println("Name is "+name);
    }   
    public static void main(String[] args) {
        std s=new std();
        s.st(18);
        s.st("Sam");
    }
}

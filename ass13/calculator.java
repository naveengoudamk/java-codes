class calculator {
    static void add(int a,int b){
        System.out.println(a+b);
    }
    static void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public static void main(String[] args) {
        add(10,2);
        add(10,2,10);
    }
}
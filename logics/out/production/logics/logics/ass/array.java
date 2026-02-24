package ass;
public class array {
    public static void main(String[] args) {
        int[]a={10,20,30};
        double[]b={1.5,2.5,3.5};
        String[]c={"Java","SQL","HTML","CSS"};
        System.out.println("int array");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println("double array");
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
        System.out.println("string array");
        for(int i=0;i<c.length;i++){
            System.out.println(c[i]);
        }
    }
    
}
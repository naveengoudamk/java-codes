import java.util.ArrayList;

public class Samp2 {

    public static void main(String[] args) {
        ArrayList l1 = new ArrayList<>();
        l1.add(10);
        l1.add("hello");
        l1.add('a');
        l1.add(true);

        System.out.println(l1);
        l1.remove(0);

        System.out.println(l1);

        l1.remove(1);

        System.out.println(l1);
    }
    
}

import java.util.ArrayList;

public class samp6 {
    public static void main(String[] args) 
    {
        
        ArrayList l1 = new ArrayList<>();
        l1.add(10);
        l1.add("hello");
        l1.add('a');
        l1.add(true);

        for(int i=0 ; i<l1.size(); i++)
        {
            Object O1 = l1.get(i);
            System.out.println(O1);
        }

    }
    
}

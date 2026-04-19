public class arraylist extends Object
{
    static Object [] arr = new Object[10];
    static int index = 0;
    void add(Object a1)
    {
        arr[index]=a1;
        index++;
    }
    public String toString()
    {
         String S1 = " ";
        for(int i =0; i<arr.length; i++)
        {
            if(arr[i]!=null)
            {
                S1 = S1 + arr[i] + " ";
            }
        }
        return S1;

    }
    public boolean contains(Object obj)
    {
        for(int i =0 ; i<arr.length; i++)
        {
            if(arr[i].equals(obj))
                return true;

        }
        return false;
    }
    public int Size()
    {
        int count =0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]!= null)
            {
                count++;
            }
           
        }
         return count;
    }
    public static void main(String[] args) 
    {
        arraylist A1 = new arraylist();
        A1.add("hello");
        A1.add(10);
        A1.add('A');
        System.out.println(A1);
        A1.Size();

        
    }
    
}

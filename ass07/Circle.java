class Circle 
{
    void area()
    {
        int r = 10;
        double area = 3.14 * r * r;
        System.out.println("area of the circle :" + area);
    }
    public static void main(String [] args)
    {
        new Circle().area();
    }

}

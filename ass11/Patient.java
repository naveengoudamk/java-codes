package ass11;
class manufactur
{
    void Medicine()
    {
        System.out.println("dolo 650 Matre");
    }

}
class Distributor
{
    static void Dolo(manufactur M3)
    {
        M3.Medicine();

    }

}
class pharmacy
{
    static void Tablets(manufactur M2)
    {
        Distributor.Dolo(M2);

    }

}
class Patient 
{
    public static void main(String[] args) 
    {
        System.out.println("i have fever so i want tablet ");

        manufactur M1 = new manufactur();
        pharmacy.Tablets(M1);
    }
    
}

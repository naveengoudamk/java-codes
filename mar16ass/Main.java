package mar16ass;
interface Employee
{
    void work();
}

class Developer implements Employee
{
    public void work()
    {
        System.out.println("Developer writes code");
    }
}

class Tester implements Employee
{
    public void work()
    {
        System.out.println("Tester tests the software");
    }
}

class Manager implements Employee
{
    public void work()
    {
        System.out.println("Manager manages the team");
    }
}

class Company
{
    static void perform(Employee e)
    {
        e.work();
    }
}

class Main
{
    public static void main(String[] args)
    {
        Developer d = new Developer();
        Tester t = new Tester();
        Manager m = new Manager();

        Company.perform(d);
        Company.perform(t);
        Company.perform(m);
    }
}
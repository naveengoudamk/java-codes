package ass12;
class BankAccount {
    int accNo;
    String holder;
    char type;

    BankAccount(int a, String b, char c) {
        accNo = a;
        holder = b;
        type = c;
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(123, "Ravi", 'S');
        System.out.println(b1.accNo);
        System.out.println(b1.holder);
        System.out.println(b1.type);
    }
}

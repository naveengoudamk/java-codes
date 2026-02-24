package ass12.t2;
class Book {
    int bid;
    String title;
    char grade;

    Book(int bid, String title, char grade) {
        this.bid = bid;
        this.title = title;
        this.grade = grade;
    }

    public static void main(String[] args) {
        Book b1 = new Book(101, "Java", 'B');
        System.out.println(b1.bid);
        System.out.println(b1.title);
        System.out.println(b1.grade);
    }
}


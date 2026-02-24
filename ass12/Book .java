package ass12;
class Book {
    int bookId;
    String title;
    char grade;

    Book(int a, String b, char c) {
        bookId = a;
        title = b;
        grade = c;
    }

    public static void main(String[] args) {
        Book b1 = new Book(101, "Java", 'B');
        System.out.println(b1.bookId);
        System.out.println(b1.title);
        System.out.println(b1.grade);
    }
}
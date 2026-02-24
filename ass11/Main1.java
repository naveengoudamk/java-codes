package ass11;

class Book {
    void read() {
        System.out.println("Reading Java book");
    }
}

class Library {
    static void issue(Book b) {
        System.out.println("Library: Book issued");
        b.read();
    }
}

class Student {
    static void borrow(Book b) {
        System.out.println("Student: Borrowing book");
        Library.issue(b);
    }
}

public class Main1 {
    public static void main(String[] args) {
        System.out.println("Main: Student needs a book");

        Book b1 = new Book();
        Student.borrow(b1);
    }
}
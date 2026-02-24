package ass12;
class Movie {
    int id;
    String title;
    char rating;

    Movie(int a, String b, char c) {
        id = a;
        title = b;
        rating = c;
    }

    public static void main(String[] args) {
        Movie m1 = new Movie(7, "Avatar", 'U');
        System.out.println(m1.id);
        System.out.println(m1.title);
        System.out.println(m1.rating);
    }
}

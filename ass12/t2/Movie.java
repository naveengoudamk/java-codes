package ass12.t2;
class Movie {
    int mid;
    String title;
    char rating;

    Movie(int mid, String title, char rating) {
        this.mid = mid;
        this.title = title;
        this.rating = rating;
    }

    public static void main(String[] args) {
        Movie m1 = new Movie(7, "Avatar", 'U');
        System.out.println(m1.mid);
        System.out.println(m1.title);
        System.out.println(m1.rating);
    }
}

package ass10;

public class CategoryDetails {
    // SCHOOL (Static) 
    static String school_name = "ABC School";
    static String school_grade = "A";
    static int school_strength = 1200;

    // MOBILE (Non-Static)
    int mobile_cost = 70000;
    String mobile_model_name = "Samsung S23";
    String mobile_colour = "Black";

    //CAR (Non-Static) 
    int car_cost = 800000;
    String car_model_name = "Hyundai i20";
    String car_type = "Petrol";

    //TV (Static)
    static int tv_cost = 45000;
    static String tv_brand = "Sony";
    static String tv_type = "LED";

    //BIKE (Static)
    static int bike_cost = 90000;
    static String bike_brand = "Honda";
    static String bike_colour = "Red";

    // --- COURSE / UNIVERSITY (Non-Static)
    String course_name = "B.E";
    String unvir_name = "VTU";
    int exam_cost = 1500;

    // ------OME (Non-Static) ----
    String home_name = "Dream Villa";
    int home_cost = 5000000;
    String home_colour = "White";

    //  EMPLOYEE (Non-Static)
    int emp_id = 101;
    double emp_sal = 45000;
    String emp_grade = "A";

    //  CLOTH (Non-Static) 
    String cloth_colour = "Blue";
    int cloth_cost = 1200;
    String cloth_size = "L";

    public static void main(String[] args) {

        CategoryDetails obj = new CategoryDetails();

        // SCHOOL
        System.out.println("---- SCHOOL ----");
        System.out.println(school_name);
        System.out.println(school_grade);
        System.out.println(school_strength);

        // MOBILE
        System.out.println("---- MOBILE ----");
        System.out.println(obj.mobile_model_name);
        System.out.println(obj.mobile_cost);
        System.out.println(obj.mobile_colour);

        // CAR
        System.out.println("---- CAR ----");
        System.out.println(obj.car_model_name);
        System.out.println(obj.car_cost);
        System.out.println(obj.car_type);

        // TV
        System.out.println("---- TV ----");
        System.out.println(tv_brand);
        System.out.println(tv_cost);
        System.out.println(tv_type);

        // BIKE
        System.out.println("---- BIKE ----");
        System.out.println(bike_brand);
        System.out.println(bike_cost);
        System.out.println(bike_colour);

        // COURSE / UNIVERSITY
        System.out.println("---- COURSE ----");
        System.out.println(obj.course_name);
        System.out.println(obj.unvir_name);
        System.out.println(obj.exam_cost);

        // HOME
        System.out.println("---- HOME ----");
        System.out.println(obj.home_name);
        System.out.println(obj.home_cost);
        System.out.println(obj.home_colour);

        // EMPLOYEE
        System.out.println("---- EMPLOYEE ----");
        System.out.println(obj.emp_id);
        System.out.println(obj.emp_sal);
        System.out.println(obj.emp_grade);

        // CLOTH
        System.out.println("---- CLOTH ----");
        System.out.println(obj.cloth_colour);
        System.out.println(obj.cloth_cost);
        System.out.println(obj.cloth_size);
    }
}
    

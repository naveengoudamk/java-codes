package mar17ass;
class Mobile {
	int cost;
	String model;
	String colour;

	Mobile(int cost, String model, String colour) {
		this.cost = cost;
		this.model = model;
		this.colour = colour;
	}

	public String toString() {
		return cost + " " + model + " " + colour;
	}
}

class Car {
	int cost;
	String model;
	String type;

	Car(int cost, String model, String type) {
		this.cost = cost;
		this.model = model;
		this.type = type;
	}

	public String toString() {
		return cost + " " + model + " " + type;
	}
}

class School {
	String name;
	char grade;
	int strength;

	School(String name, char grade, int strength) {
		this.name = name;
		this.grade = grade;
		this.strength = strength;
	}

	public String toString() {
		return name + " " + grade + " " + strength;
	}
}

class TV {
	int cost;
	String brand;
	String type;

	TV(int cost, String brand, String type) {
		this.cost = cost;
		this.brand = brand;
		this.type = type;
	}

	public String toString() {
		return cost + " " + brand + " " + type;
	}
}

class Bike {
	int cost;
	String brand;
	String colour;

	Bike(int cost, String brand, String colour) {
		this.cost = cost;
		this.brand = brand;
		this.colour = colour;
	}

	public String toString() {
		return cost + " " + brand + " " + colour;
	}
}

class Course {
	String courseName;
	String university;
	int examCost;

	Course(String courseName, String university, int examCost) {
		this.courseName = courseName;
		this.university = university;
		this.examCost = examCost;
	}

	public String toString() {
		return courseName + " " + university + " " + examCost;
	}
}

class Laptop {
	String name;
	int cost;
	String brand;

	Laptop(String name, int cost, String brand) {
		this.name = name;
		this.cost = cost;
		this.brand = brand;
	}

	public String toString() {
		return name + " " + cost + " " + brand;
	}
}

class Home {
	String name;
	int cost;
	String colour;

	Home(String name, int cost, String colour) {
		this.name = name;
		this.cost = cost;
		this.colour = colour;
	}

	public String toString() {
		return name + " " + cost + " " + colour;
	}
}

class Employ {
	int id;
	double sal;
	char grade;

	Employ(int id, double sal, char grade) {
		this.id = id;
		this.sal = sal;
		this.grade = grade;
	}

	public String toString() {
		return id + " " + sal + " " + grade;
	}
}

class Cloth {
	String colour;
	int cost;
	String size;

	Cloth(String colour, int cost, String size) {
		this.colour = colour;
		this.cost = cost;
		this.size = size;
	}

	public String toString() {
		return colour + " " + cost + " " + size;
	}
}

public class MainClass {
	public static void main(String[] args) {

		Mobile m = new Mobile(20000, "Samsung", "Black");
		Car c = new Car(800000, "Swift", "Petrol");
		School s = new School("ABC", 'A', 500);
		TV t = new TV(40000, "LG", "Smart");
		Bike b = new Bike(90000, "Honda", "Red");
		Course co = new Course("BE", "VTU", 1500);
		Laptop l = new Laptop("Dell", 60000, "i5");
		Home h = new Home("Villa", 5000000, "White");
		Employ e = new Employ(101, 25000, 'A');
		Cloth cl = new Cloth("Blue", 1200, "L");

		System.out.println(m);
		System.out.println(c);
		System.out.println(s);
		System.out.println(t);
		System.out.println(b);
		System.out.println(co);
		System.out.println(l);
		System.out.println(h);
		System.out.println(e);
		System.out.println(cl);
	}
}
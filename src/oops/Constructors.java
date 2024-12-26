package oops;

public class Constructors {
	int age;
	String name;
	double sal;
	int id;

	Constructors() {
		System.out.println("Defualt Constructors");
	}

	public Constructors(int age, String name, double sal, int id) {
		this.age = age;
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	public Constructors(Constructors s2) {
		this.age = s2.age;
		this.id = s2.id;
		this.name = s2.name;
		this.sal = s2.sal;
	}

	@Override
	public String toString() {
		return "Age: " + age + ", Name: " + name + ", Salary: " + sal + ", ID: " + id;
	}

	public static void main(String[] args) {
		Constructors s1 = new Constructors();
		Constructors s2 = new Constructors(10, "IRFAN", 120.00, 123);
		
		Constructors s3 = new Constructors(10, "BASHA", 123.00, 123);
		System.out.println(s2);
	}
}

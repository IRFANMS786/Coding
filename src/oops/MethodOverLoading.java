package oops;

public class MethodOverLoading {

	public static void main(String[] args) {
		MethodOverLoading obj1 = new MethodOverLoading();
		obj1.add(10, 20);
		obj1.add(20, 30, 40);

	}

	public void add(int a, int b) {
		int sum = a + b;
		System.out.println("The Sum of two numbers is ...." + sum);

	}

	public void add(int a, int b, int c) {
		int sum = a + b + c;
		System.out.println("The Sum of Three numbers is ...." + sum);

	}

}

package oops;

public class HDFC extends Bank {
	public float getRateOfInterest() {
		return 10f;
	}

	public static void main(String[] args) {
		HDFC h1 = new HDFC();
		System.out.println("The Rate of interest is..." + h1.getRateOfInterest());
	}
}

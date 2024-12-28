package codingPrograms;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialNumber {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the Number to find the Factorial of a Number  ");
		int n = s1.nextInt();
//		int fact = 1; n>20.
		
		 BigInteger fact = BigInteger.ONE;

		for (int i = 1; i <= n; i++) {
		//	fact = fact * i; //n>20.
			
			fact = fact.multiply(BigInteger.valueOf(i));  // Multiply BigInteger
		}
		System.out.println("The Factorial of Given Number is " + fact);

	}
}

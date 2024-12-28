package codingPrograms;

import java.util.Scanner;

public class CountDigitsinNumber {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the Number to find the Number of Digits in it: ");
		int n = s1.nextInt();
		int count = 0;

		while (n != 0) {
			n = n / 10; // Update the value of n by removing the last digit
			count++; // Increment the digit count
		}

		System.out.println("The number of digits in the given number is: " + count);
	}
}

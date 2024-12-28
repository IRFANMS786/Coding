package codingPrograms;

import java.util.Scanner;

public class CountEvenOddDigits {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the Number to find the Number of Digits in it: ");
		int n = s1.nextInt();

		int evenCount = 0;
		int oddCount = 0;
		int digit;

		while (n != 0) {
			digit = n % 10;

			if (digit % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
			n /= 10; // Remove the last digit

		}

		System.out.println("The Number of Even Digit in a given Number " + evenCount);
		System.out.println("The Number of Odd Digit in a given Number " + oddCount);

	}
}

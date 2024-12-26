package codingPrograms;

import java.util.Random;

public class ReverseofString {
	public static void main(String[] args) {
		ReverseofString r1= new ReverseofString();
		r1.generateRandomNumbers(3);
		String str1 = "IRFAN";
		System.out.println("Original string: " + str1);
		int n = str1.length(); // caclulates length of String

		String Reverse_String = "";
		char ch;
		for (int i = 0; i < n; i++) {
			// fetch each character
			ch = str1.charAt(i);
			System.out.println(ch);

			// concatenates each character in front of the new string
			Reverse_String = ch + Reverse_String;
		}
		System.out.println("Reversed string: " + Reverse_String); // Display the reversed String

	}

	public String generateRandomNumbers(int length) {
		StringBuilder randomNumbers = new StringBuilder(length);
		Random random = new Random();

		for (int i = 0; i < length; i++) {
			int digit = random.nextInt(10000); // Generate a random number between 0 and 9
			randomNumbers.append(digit);
		}

		return randomNumbers.toString();
	}

}

package stringsfunctions;

import java.util.Scanner;

public class CountVowelsAndConsonants {
	public static void main(String[] args) {

		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter The Alphanumeric String...");
		String orgString = s1.nextLine();
		int vowels = 0;
		int consonants = 0;
		// Iterate through the string character by character
		for (int i = 0; i < orgString.length(); i++) {
			char currentChar = Character.toLowerCase(orgString.charAt(i));

			// Check if the character is an alphabet (A-Z or a-z)
			if ((currentChar >= 'a' && currentChar <= 'z')) {
				if (currentChar >= 'a' && currentChar <= 'i' && currentChar <= 'e' && currentChar <= 'o'
						&& currentChar <= 'u') {

					vowels++;
				} else
					consonants++;

			}

		}
		System.out.println("The Number of Vowels are...." + vowels);
		System.out.println("The Number of Consonants are...." + consonants);

	}

}

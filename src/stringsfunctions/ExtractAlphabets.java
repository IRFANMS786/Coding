package stringsfunctions;

import java.util.Scanner;

public class ExtractAlphabets {
	public static void main(String[] args) {
//		Scanner s1 = new Scanner(System.in);
//		System.out.println("Enter The AlpaNumberic ...");
//		String orgString=s1.nextLine();
//		
//		  String alphabetsOnly = orgString.replaceAll("[^A-Z.a-z]", "");
//		  
//		  System.out.println(alphabetsOnly);
//		  
//		  String numbersOnly = orgString.replaceAll("[^0-9]", "");
//		
//		  System.out.println(numbersOnly);

		// Without Buildin Functions
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter The Alphanumeric String...");
		String orgString = s1.nextLine();

		// Initialize empty strings to store alphabets and numbers
		String alphabetsOnly = "";
		String numbersOnly = "";
		String specialCharacters = "";
		int numbersOnlyCount = 0;
		int StringOnlyCount = 0;
		int SpecialCharctersOnlyCount = 0;
		// Iterate through the string character by character
		for (int i = 0; i < orgString.length(); i++) {
			char currentChar = orgString.charAt(i);

			// Check if the character is an alphabet (A-Z or a-z)
			if ((currentChar >= 'A' && currentChar <= 'Z') || (currentChar >= 'a' && currentChar <= 'z')) {
				alphabetsOnly += currentChar;
				StringOnlyCount++;
			}
			// Check if the character is a digit (0-9)
			else if (currentChar >= '0' && currentChar <= '9') {
				numbersOnly += currentChar;
				numbersOnlyCount++;
			} else {
				specialCharacters += currentChar;
				SpecialCharctersOnlyCount++;
			}
		}

		// Print the results
		System.out.println("Alphabets Only: " + alphabetsOnly);
		System.out.println("Numbers Only: " + numbersOnly);
		System.out.println("SpecialCharacters Only: " + specialCharacters);

		// Print the results
		System.out.println("StringOnlyCount: " + StringOnlyCount);
		System.out.println("numbersOnlyCount: " + numbersOnlyCount);
		System.out.println("SpecialCharctersOnlyCount : " + SpecialCharctersOnlyCount);

	}

}

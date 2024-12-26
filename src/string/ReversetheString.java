package string;

import java.util.Scanner;

public class ReversetheString {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the String to Reverse and check whether it is palindrome or not");
		String original_String = s1.nextLine();
		String Reverse_String = "";
		char ch;
		int n = original_String.length();
		for (int i = 0; i < n; i++) {
			// fetch each character
			ch = original_String.charAt(i);
			System.out.println(ch);

			// concatenates each character in front of the new string
			Reverse_String = ch + Reverse_String;
		}
		System.out.println("The Reverse of a String" + Reverse_String);
		if (original_String.equals(Reverse_String)) {
			System.out.println("The Given String is Palindorme");
		} else
			System.out.println("The Given String is not  Palindorme");
	}

}

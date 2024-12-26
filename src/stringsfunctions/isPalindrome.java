package stringsfunctions;

import java.util.Scanner;

public class isPalindrome {
	public static void main(String[] args) {

		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter The  String...");
		String orgString = s1.nextLine();
		String reverseString = "";
		int len = orgString.length();
		Character ch;
		for (int i = 0; i < len; i++) {
			ch = orgString.charAt(i);
			reverseString = ch + reverseString;

		}
		System.out.println("The Reverse of a String is..."+reverseString);
		if (reverseString.equals(orgString)) {
			System.out.println("The Given String is a palindore String ");

		} else
			System.out.println("The Given String is not a palindore String ");
	}

}

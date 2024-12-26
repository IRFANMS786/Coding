package stringsfunctions;

import java.util.Scanner;

public class ReverseofString {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter The Number To Reversed...");
		String orgString=s1.nextLine();
		
		String revString="";
		for (int i = 0; i < orgString.length(); i++) {
			// fetch each character
			Character ch;
			ch = orgString.charAt(i);
			revString = ch + revString;
			
			}
		System.out.println("The Reverse of String is "+revString);
		
		
	}

}

package stringsfunctions;

import java.util.Scanner;

public class PrintEachLettersofString {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the String to Print Each Letter of that");
		String str1 = s1.nextLine();
		Character ch;
		int len = str1.length();
		for (int i = 0; i < len; i++) {
			ch = str1.charAt(i);
			System.out.println("The "+i+" Letter is "+ch);
		}
//		System.out.println(str1.concat("irfanms"));
//		System.out.println(str1.compareToIgnoreCase("irfanms"));
//		System.out.println(str1.compareTo("irfanms"));
//		System.out.println(str1.contentEquals("irfanms"));
//		System.out.println(str1.isBlank());
	}

}

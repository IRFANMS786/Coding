package stringsfunctions;

import java.util.Scanner;

public class EvenOddCounter {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Print Just Even Number from Given set series of number ");
		int evencount = 0;
		int oddcount = 0;
		String series = s1.nextLine();
		System.out.println("The Even Number are ...");
		for (int i = 0; i <= series.length() - 1; i++) {
			char ch = series.charAt(i);
			int digit = Character.getNumericValue(ch);

			if (digit % 2 == 0) {

				System.out.println(digit);
				evencount++;

			} else
				oddcount++;
		}
		System.out.println("The Even Number Count are ..." + evencount);
		System.out.println("The ODD Number Count are ..." + oddcount);
	}

}
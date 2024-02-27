package codingPrograms;

import java.util.Scanner;

public class DaysBetween {
	
	public static void main(String[] args) {
		DaysBetweenLogic d1 = new DaysBetweenLogic();
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the Year");
		int year = s1.nextInt();
		System.out.println("Enter the Month");
		int month = s1.nextInt();
		System.out.println("Enter the Day");
		int day = s1.nextInt();
		d1.daysBetween(year, month, day);
		s1.close(); // Remember to close the scanner
	}

}

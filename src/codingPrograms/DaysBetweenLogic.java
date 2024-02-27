package codingPrograms;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DaysBetweenLogic {
	public void daysBetween(int year, int month, int day) {
		// Define the start date
		LocalDate startDate = LocalDate.of(year, month, day);

		// Get the present day
		LocalDate presentDay = LocalDate.now();

		// Calculate the difference in days
		long daysBetween = ChronoUnit.DAYS.between(startDate, presentDay);

		System.out.println("Days between the given date and present day: " + daysBetween);
	}

	

}

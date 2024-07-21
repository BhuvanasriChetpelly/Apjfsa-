package basic_programs_of_java;

import java.util.Scanner; // Import Scanner class for user input

public class DaysInaMonth {

	// Method to determine the number of days in a month based on the month number.
	// This method takes an integer month number as a parameter.
	void month(int m) {
		// Switch statement to check the month number and print the corresponding number
		// of days.
		switch (m) {
		// Months with 31 days: January, March, May, July, August, October, December
		case 1: // January
		case 3: // March
		case 5: // May
		case 7: // July
		case 8: // August
		case 10: // October
		case 12: // December
			System.out.println("31 Days"); // Print "31 Days" for these months
			break; // Exit the switch statement

		// Months with 30 days: April, June, September, November
		case 4: // April
		case 6: // June
		case 9: // September
		case 11: // November
			System.out.println("30 Days"); // Print "30 Days" for these months
			break; // Exit the switch statement

		// February, which has 28 or 29 days depending on whether it's a leap year
		case 2: // February
			System.out.println("28/29 Days"); // Print "28/29 Days" as February can have 28 or 29 days
			break; // Exit the switch statement

		// Default case for invalid month numbers
		default:
			System.out.println("Invalid Month"); // Print "Invalid Month" if the month number is out of range
			break; // Exit the switch statement
		}
	}

	// Main method to run the program
	public static void main(String[] args) {
		// Declare an integer variable to store the month number entered by the user
		int monthno;

		// Create a Scanner object to read user input from the console
		Scanner sc = new Scanner(System.in);

		// Prompt the user to enter the month number
		System.out.println("Enter Month Number:");

		// Read the integer month number from the user
		monthno = sc.nextInt();

		// Create an instance of the DaysInaMonth class
		DaysInaMonth obj = new DaysInaMonth();

		// Call the month method on the object to determine the number of days in the
		// specified month
		obj.month(monthno);

		// Close the Scanner object to prevent resource leaks
		sc.close();
	}
}

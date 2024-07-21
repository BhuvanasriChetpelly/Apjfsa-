package basic_programs_of_java;

// Importing the Scanner class to read user input from the console
import java.util.Scanner;

// Class declaration for the ATM application
public class DemoBreak {

	public static void main(String[] args) {

		// Variable declarations
		int withdrawAmount; // Variable to store the amount the user wants to withdraw
		int sumAmount = 0; // Variable to keep track of the total withdrawn amount for the day
		int acBalance = 120000; // Initial account balance

		// Creating a Scanner object to read input from the console
		Scanner sc = new Scanner(System.in);

		// Using a while loop to continue the process as long as the account balance is
		// greater than 0
		while (acBalance > 0) {
			// Prompt the user to enter the amount they want to withdraw
			System.out.println("Enter amount to withdraw:");
			withdrawAmount = sc.nextInt();

			// Check if the total withdrawn amount exceeds the daily limit of 50,000
			if (sumAmount + withdrawAmount > 50000) {
				// Inform the user that the daily limit is exceeded and break out of the loop
				System.out.println("Daily withdrawal limit of 50,000 exceeded.");
				break; // Exit the while loop
			}

			// Check if the withdrawal amount is less than or equal to the account balance
			if (withdrawAmount <= acBalance) {
				// Update the total withdrawn amount and account balance
				sumAmount += withdrawAmount;
				acBalance -= withdrawAmount;
				// Inform the user of the new account balance and the amount withdrawn
				System.out.println("Amount withdrawn: " + withdrawAmount);
				System.out.println("A/C Balance: " + acBalance);
				System.out.println("Total Amount Withdrawn Today: " + sumAmount);
			} else {
				// Inform the user if the withdrawal amount exceeds the account balance
				System.out.println("Insufficient funds. Please enter a lesser amount.");
			}
		}

		// Close the scanner object to free up resources
		sc.close();

		// Inform the user that the ATM session has ended
		System.out.println("ATM session ended. Thank you for using the ATM.");
	}
}

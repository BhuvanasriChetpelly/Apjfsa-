package basic_programs_of_java;

//Importing scanner class
import java.util.Scanner;

//Main class
public class DemoContinue {
	public static void main(String args[]) {

		// Variable to store the user input range
		int range;
		// Variable to keep track of the sum of odd numbers
		int sum = 0;

		// Prompt the user to enter the range
		System.out.println("Enter range:");
		// Create a Scanner object to read user input
		Scanner sc = new Scanner(System.in);
		// Read the integer input from the user
		range = sc.nextInt();

		// Loop from 0 to the user-specified range (inclusive)
		for (int i = 0; i <= range; i++) {
			// If the current number is even, skip the rest of the loop and continue with
			// the next iteration
			if (i % 2 == 0)
				continue;
			// Add the current odd number to the sum
			sum += i;
			// Print the current sum after adding the odd number
			System.out.println(sum);
		}
	}
}

// Program to print Fibonacci Series.
package basic_programs_of_java;

// Importing the Scanner class for reading input from the console
import java.util.Scanner;

// Class declaration for the FibonacciDemo program
public class FibonacciDemo {

	// Main method where the execution of the program begins
	public static void main(String args[]) {

		// Variable declarations
		int n, a = 0, b = 0, c = 1, i = 0;

		// Creating a Scanner object to read user input from the console
		Scanner sc = new Scanner(System.in);

		// Prompting the user to enter the number of terms for the Fibonacci series
		System.out.print("Enter value of n: ");
		// Reading the integer input from the user and storing it in the variable 'n'
		n = sc.nextInt();

		// Printing the title for the Fibonacci series output
		System.out.print("Fibonacci Series: ");

		// Using a while loop to generate and print Fibonacci numbers up to the nth term
		while (i <= n) {
			// Update the values for the next term in the Fibonacci series
			a = b; // Assign the current value of 'b' to 'a'
			b = c; // Assign the current value of 'c' to 'b'
			c = a + b; // Compute the next term in the series as the sum of 'a' and 'b'
			// Print the current term in the Fibonacci series
			System.out.print(a + " ");
			// Increment the counter to keep track of the number of terms printed
			i++;
		}
	}
}

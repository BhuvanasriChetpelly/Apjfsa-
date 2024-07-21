package basic_programs_of_java;

public class FizzBuzz {

	public static void main(String args[]) {

		// Declare an integer variable to be used in the for loop
		int i;

		// Start a for loop that iterates from 1 to 50 inclusive
		for (i = 1; i <= 50; i++) {
			// Check if the number is divisible by 4
			if (i % 4 == 0) {
				// If divisible by 4, print "Fizz"
				System.out.println("Fizz");
			}
			// Check if the number is divisible by 5
			else if (i % 5 == 0) {
				// If divisible by 5, print "Buzz"
				System.out.println("Buzz");
			}
			// Check if the number is divisible by both 4 and 5
			else if (i % 4 == 0 && i % 5 == 0) {
				// If divisible by both 4 and 5, print "FizzBuzz"
				System.out.println("FizzBuzz");
			}
			// If none of the above conditions are met
			else {
				// Print the number itself
				System.out.println(i);
			}
		}
	}
}

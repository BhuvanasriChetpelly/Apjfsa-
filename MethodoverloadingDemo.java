package basic_programs_of_java;

// Class declaration for the MethodoverloadingDemo program
public class MethodoverloadingDemo {

	// Method to calculate the average of two integers
	// Method overloading: Same method name with different parameters
	double avg(int a, int b) {
		// Calculate the average of two numbers
		double avg = (a + b) / 2.0; // Use 2.0 to ensure floating-point division
		// Return the calculated average
		return avg;
	}

	// Method to calculate the average of three integers
	// Method overloading: Same method name with different parameters
	double avg(int a, int b, int c) {
		// Calculate the average of three numbers
		double avg = (a + b + c) / 3.0; // Use 3.0 to ensure floating-point division
		// Return the calculated average
		return avg;
	}

	// Method to calculate the average of four integers
	// Method overloading: Same method name with different parameters
	double avg(int a, int b, int c, int d) {
		// Calculate the average of four numbers
		double avg = (a + b + c + d) / 4.0; // Use 4.0 to ensure floating-point division
		// Return the calculated average
		return avg;
	}

	// Main method where the execution of the program begins
	public static void main(String args[]) {
		// Create an instance of MethodoverloadingDemo class
		MethodoverloadingDemo obj = new MethodoverloadingDemo();

		// Call the avg method with two integers and print the result
		System.out.println("avg= " + obj.avg(10, 20)); // Should print the average of 10 and 20

		// Call the avg method with three integers and print the result
		System.out.println("avg= " + obj.avg(10, 20, 30)); // Should print the average of 10, 20, and 30

		// Call the avg method with four integers and print the result
		System.out.println("avg= " + obj.avg(10, 20, 30, 40)); // Should print the average of 10, 20, 30, and 40
	}
}

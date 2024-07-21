//Program on bubble sort.
package basic_programs_of_java;

// Class declaration
public class BubblesortArray {

	// Main method where the program starts execution
	public static void main(String args[]) {
		// Initialize the array with unsorted elements
		int arr[] = { 3, 2, 8, 7, 6 }; // Array to be sorted
		int i, j; // Loop variables for iteration

		// Outer loop to control the number of passes over the array
		// Each pass moves the largest unsorted element to its correct position
		for (i = 0; i < arr.length - 1; i++) {
			// Inner loop for comparing adjacent elements
			// After each pass, the next largest element is placed at the end of the
			// unsorted portion of the array
			for (j = 0; j < arr.length - i - 1; j++) {
				// Compare adjacent elements
				if (arr[j] > arr[j + 1]) {
					// Swap elements if they are in the wrong order
					// Create a temporary variable to help with the swap
					int temp = arr[j]; // Store the current element in a temp variable
					arr[j] = arr[j + 1]; // Move the next element to the current position
					arr[j + 1] = temp; // Put the current element in the next position
				}
			}
		}

		// Print the sorted array
		// Loop through the array to display the sorted elements
		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " "); // Print each element followed by a space
		}
	}
}

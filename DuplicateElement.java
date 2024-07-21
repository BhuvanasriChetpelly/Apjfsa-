package basic_programs_of_java;

// Class to find and display duplicate elements in an array
public class DuplicateElement {

	public static void main(String[] args) {
		// Initializing elements in an array
		int[] arr = { 5, 8, 6, 4, 8, 2, 7, 2 }; // Array with some duplicate elements
		int count = 0; // Variable to count the number of duplicate elements

		System.out.println("Duplicate elements in the given array are:");

		// Using nested for loops to search for duplicate elements
		for (int i = 0; i < arr.length; i++) {
			// Check for duplicates only for the current element with subsequent elements
			for (int j = i + 1; j < arr.length; j++) {
				// If a duplicate element is found
				if (arr[i] == arr[j]) {
					// Print the duplicate element
					System.out.println(arr[j]);
					// Increment the count of duplicate elements
					count++;
					// Break the inner loop to avoid printing the same duplicate multiple times
					break;
				}
			}
		}

		// Print the total number of duplicate elements found
		System.out.println("Total number of duplicate elements: " + count);
	}
}

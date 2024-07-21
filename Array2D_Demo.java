package basic_programs_of_java;

public class Array2D_Demo {

	public static void main(String args[]) {

		// Create a 2x2 integer array and initialize it.
		int[][] arr = new int[2][2];

		// Assign values to the elements of the 2D array.
		arr[0][0] = 10; // First row, first column
		arr[0][1] = 11; // First row, second column
		arr[1][0] = 12; // Second row, first column
		arr[1][1] = 13; // Second row, second column

		// Declare variables for loop control.
		int i, j;

		// Loop through each row of the 2D array.
		for (i = 0; i < 2; i++) {
			// Loop through each column of the 2D array.
			for (j = 0; j < 2; j++) {
				// Print the value of the current element followed by a space.
				System.out.print(arr[i][j] + " ");
			}
			// Print a newline character after printing all columns of the current row.
			System.out.println();
		}

		// Create and initialize another 2x2 integer array using an array initializer.
		int[][] arr1 = { { 1, 2 }, { 2, 3 } };

		// Print the number of rows in the 2D array arr1.
		System.out.println("No.of rows in arr1= " + arr1.length); // arr1 has 2 rows

		// Print the number of columns in the first row of the 2D array arr1.
		System.out.println("No.of columns in arr1= " + arr1[0].length); // arr1 has 2 columns in each row

		// Create a new 2x2 integer array to store the sum of arr and arr1.
		int[][] arr2 = new int[2][2];

		// Loop through each row of the arrays.
		for (i = 0; i < 2; i++) {
			// Loop through each column of the arrays.
			for (j = 0; j < 2; j++) {
				// Add corresponding elements of arr and arr1 and store in arr2.
				arr2[i][j] = arr[i][j] + arr1[i][j];

				// Print the value of the current element of arr2 followed by a space.
				System.out.print(arr2[i][j] + " ");
			}
			// Print a newline character after printing all columns of the current row.
			System.out.println();
		}

	}
}

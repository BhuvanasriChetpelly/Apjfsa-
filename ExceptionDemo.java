// program demonstrating Exception handling using try, catch and finally for handling 
//a Arithmetic Exception and Array Index Out of Bounds Exception

package com.exe;

public class ExceptionDemo {

    public static void main(String[] args) {

    	//assigning values to variables.
        int a, b, c;
        a = 10;
        b = 0;

        // Starting point of the code
        System.out.println("Start of code");

        // Handling arithmetic exception
        try {
            c = a / b; // Attempting division by zero
            System.out.println("c=" + c); // This line won't execute due to exception
        } catch (ArithmeticException AE) {
            System.out.println("Exception caught"); // Printing exception message
        }

        // Handling array index out-of-bounds exception
        try {
            int arr[] = { 1, 2, 3 };
            System.out.println(arr[3]); // Accessing index 3 (which doesn't exist)
        } catch (ArrayIndexOutOfBoundsException AE) {
            System.out.println("Array Exception caught"); // Printing exception message
        }

        // Finally block always executes, regardless of exceptions
        finally {
            System.out.println("End of code"); // Printing at the end of execution
        }

    }
}


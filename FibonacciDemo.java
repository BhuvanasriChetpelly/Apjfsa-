// Program to print Fibonacci Series.

package apjfsa;

// importing scanner class

import java.util.Scanner;

	//class declaration

public class FibonacciDemo {
	
	public static void main(String args[]) {
		
		//variables declaration
		
		int n, a=0, b=0, c = 1, i=0;
		
		// using scanner class to read input from console
		
		Scanner sc = new Scanner(System.in);
		
		// printing value of n
		
		System.out.print("Enter value of n: ");
		n = sc.nextInt();
		
		// printing fibonacci series 
		
		System.out.print("Fibonacci Series: ");
		
		//using while loop 
		
		while(i<=n)
		{
			a = b;
			b = c;
			c = a + b;
			System.out.print(a+" ");
			i++;
		}
	}

}
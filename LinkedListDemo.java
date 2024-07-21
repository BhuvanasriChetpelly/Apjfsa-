package basic_programs_of_java;

// Importing the LinkedList class and List interface from the Java Collections Framework
import java.util.LinkedList;
import java.util.List;

// Class declaration for the LinkedListDemo program
public class LinkedListDemo {

	// Main method where the execution of the program begins
	public static void main(String[] args) {

		// Creating a LinkedList object that implements the List interface
		// It will store Double values
		List<Double> llist = new LinkedList<Double>();

		// Adding elements to the LinkedList
		llist.add(200.05); // Adds 200.05 to the end of the list
		llist.add(3001.25); // Adds 3001.25 to the end of the list
		llist.add(2007.05); // Adds 2007.05 to the end of the list
		llist.add(3001.25); // Adds 3001.25 to the end of the list (duplicate value)
		llist.add(2020.05); // Adds 2020.05 to the end of the list
		llist.add(3085.5); // Adds 3085.5 to the end of the list

		// Printing the entire LinkedList
		// Displays the contents of the list
		System.out.println(llist);

		// Printing the size of the LinkedList
		// Displays the number of elements in the list
		System.out.println(llist.size());
	}
}

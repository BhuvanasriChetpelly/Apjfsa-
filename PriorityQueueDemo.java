package apjfsa;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {

		// Create a PriorityQueue of Integers
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

		// Add elements to the PriorityQueue
		pq.add(10);
		pq.add(20);
		pq.add(30);
		pq.add(40);
		pq.add(50);

		// Print the PriorityQueue (order not guaranteed)
		System.out.println(pq);

		// Peek at the head of the PriorityQueue (element with smallest value)
		System.out.println("Peek: " + pq.peek());

		// Poll the head of the PriorityQueue (remove and retrieve the smallest element)
		System.out.println("Poll: " + pq.poll());

		// Remove an element from the PriorityQueue (also removes and retrieves the
		// smallest element)
		System.out.println("Remove: " + pq.remove());

		// Print the PriorityQueue after removals (new order after removals)
		System.out.println(pq);

		// Print the size of the PriorityQueue
		System.out.println("Size: " + pq.size());

		// Add an element to the PriorityQueue (returns true)
		System.out.println("Add 10: " + pq.add(10));

		// Print the PriorityQueue after adding an element (new order after addition)
		System.out.println(pq);

		// Check if the PriorityQueue is empty
		System.out.println("Is empty: " + pq.isEmpty());
	}
}
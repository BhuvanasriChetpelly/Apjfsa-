package basic_programs_of_java;

// A class representing an Employee with various properties and methods
public class EmpDemo {
	// Instance variables to store employee details
	int empId; // Employee ID
	String empName; // Employee Name
	int salary; // Employee Salary

	// Default constructor
	// Initializes the object and prints a message indicating creation
	EmpDemo() {
		System.out.println("Employee object is created");
	}

	// Parameterized constructor
	// Initializes the employee details with given values
	EmpDemo(int id, String n, int s) {
		empId = id; // Set employee ID
		empName = n; // Set employee Name
		salary = s; // Set employee Salary
	}

	// Method to display employee information
	// Prints the details of the employee
	void empInfo() {
		System.out.println("Employee details: " + "\nempId: " + empId + "\nName: " + empName + "\nSalary: " + salary);
	}

	// Main method to demonstrate the creation of EmpDemo objects
	public static void main(String args[]) {
		// Creating an EmpDemo object using the default constructor
		EmpDemo emp = new EmpDemo();
		emp.empId = 1254; // Assign employee ID
		emp.empName = "Yashika"; // Assign employee Name
		emp.salary = 5000; // Assign employee Salary
		emp.empInfo(); // Display employee information

		// Creating another EmpDemo object using the parameterized constructor
		EmpDemo emp1 = new EmpDemo(1236, "Rana", 60000);
		emp1.empInfo(); // Display employee information
	}
}

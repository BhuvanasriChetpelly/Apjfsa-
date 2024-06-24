//Program using method overloading.
//a. Overload with area().
package apjfsa;

//Declaring class
public class MethodOverloading {
	
	//Declaring method area() of square.
	void area(float a) {
		System.out.println("Area of the square = "+(a*a)+" sq.units");// Calculating area of square = side*side., here side=a
	}
	//Declaring method area() of rectangle. 
		void area(float a, float b) {
			System.out.println("Area of the rectangle = "+(a*b)+" sq.units");//Calculating area of rectangle = length*breath., here length=a & breadth=b
		}
		//Declaring method area() of circle.
			void area(double a) {
			 
			double r = 3.14*a*a;	
			System.out.println("Area of the circle = "+(r)+" sq.units");//Calculating area of circle = pi*radius*radius., here pi=3.14 & radius=a
			
		}
			
			//Creating main class for method overloading.

 	public static void main(String args[]) {
 		
 		//Creating object for method overloading.
 		MethodOverloading MO = new MethodOverloading();
 		MO.area(5);//assigning value of side of square.
 		MO.area(10, 20);//assigning values of length & breadth of rectangle.
 		MO.area(2);//assigning value of radius of circle.
 		
 	}
} 	
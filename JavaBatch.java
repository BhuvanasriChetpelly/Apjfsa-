package basic_programs_of_java;

// Define a class called JavaBatch
public class JavaBatch {

    // Main method
    public static void main(String[] args) {
        
        // Create an array to hold StudentDemo objects with a size of 5
        StudentDemo[] students = new StudentDemo[5];
        
        // Initialize each element of the array with StudentDemo objects
        students[0] = new StudentDemo(1, "Sai", 22);
        students[1] = new StudentDemo(2, "Manasa", 21);
        students[2] = new StudentDemo(3, "Shravani", 23);
        students[3] = new StudentDemo(4, "Mouni", 23);
        students[4] = new StudentDemo(5, "Gana", 22);
        
        // Iterate through the array using a traditional for loop
        // and print each element using its toString() method
        int i;
        for(i = 0; i < 5; i++) {
            System.out.println(students[i]);
        }
        
        // Iterate through the array using an enhanced for loop (for-each loop)
        // and print each element using its toString() method
        for(StudentDemo s : students) {
            System.out.println(s);
        }
    }
}
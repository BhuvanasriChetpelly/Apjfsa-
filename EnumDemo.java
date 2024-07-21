package basic_programs_of_java;

//Define an enum called Department with four constants: Accounts, Devops, Testing, and HR
enum Department {
 Accounts, Devops, Testing, HR
}

//Main class
public class EnumDemo {
 public static void main(String[] args) {
     // Declare a variable 'd' of type Department and assign it the value HR
     Department d = Department.HR;
     
     // Declare another variable 'd1' of type Department and assign it the value Accounts
     Department d1 = Department.Accounts;
     
     // Print the value of 'd', which is HR
     System.out.println(d);
     
     // Compare the ordinal values of 'd' and 'd1', and print the result
     
     System.out.println(d.compareTo(d1));
     
     // Compare 'd' and 'd1' for equality and print the result
     // Since they are different enum constants, the output will be 'false'
     System.out.println(d.equals(d1));
     
     // Print the hash code of 'd'
     System.out.println(d.hashCode());
 }
}
package apjfsa;

	import java.util.Scanner;
public class DaysInaMonth {
	void month(int m) {
		switch(m) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31 Days");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30 Days");
			break;
		case 2:
			System.out.println("28/29 Days");
			break;
		default:
			System.out.println("Invalid Month");
			break;
	    
		}
			
	}
	public static void main(String args[])
	{
		int monthno;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Month Number:");
		monthno=sc.nextInt();
		DaysInaMonth obj = new DaysInaMonth();
        obj.month(monthno);
		
	}
}



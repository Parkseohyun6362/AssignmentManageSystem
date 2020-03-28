import java.util.Scanner;

public class AssignmentManageSystem {

	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		int num =5;
		
		while(num != 6) {
		System.out.println(" This is your studying planner ! ");
		System.out.println("1. Add assignment");
		System.out.println("2. Delete assignment");
		System.out.println("3. Edit assignment");
		System.out.println("4. View assignment");
		System.out.println("5. Show a menu");
		System.out.println("6. Exit");
		System.out.println("Select one number between 1 - 6 :");
		num = input.nextInt();
		if (num == 1) {
			Addassignment();
		}
		else if (num ==2 ) {
			Deleteassignment();
		}
		else if (num ==3 ) {
			Editassignment();
		}
		else if (num ==4 ) {
			Viewassignment();
		}
		else  {
			continue;
		}
		}
	}
	
	public static void Addassignment() {
		Scanner input =  new Scanner(System.in);
		System.out.print("subject :");
		String subject = input.nextLine();
		System.out.print("assignment name :");
		String assignmentName = input.next();
		System.out.print("assignment submission period :");
		String submissionPeriod = input.next();
		System.out.print("assignment Submission method:");
		String submissionMethod = input.next();
	}
	public static void Deleteassignment() {
		Scanner input =  new Scanner(System.in);
		System.out.print("subject :");
		String subject = input.nextLine();	
	}
	public static void Editassignment() {
		Scanner input =  new Scanner(System.in);
		System.out.print("subject :");
		String subject = input.nextLine();
	}
	public static void Viewassignment() {
		Scanner input =  new Scanner(System.in);
		System.out.print("subject :");
		String subject = input.nextLine();
	}
	

}

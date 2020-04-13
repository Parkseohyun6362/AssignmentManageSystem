import java.util.Scanner;

public class Menumanagement {
	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		AssignmentManage assignmentmanage = new AssignmentManage(input);
		int num =-1;
		while(num != 5) {
			System.out.println(" This is your studying planner ! ");
			System.out.println("1. Add assignment");
			System.out.println("2. Delete assignment");
			System.out.println("3. Edit assignment");
			System.out.println("4. View assignments");
			System.out.println("5. Exit");
			System.out.println("Select one number between 1 - 5 :");
			num = input.nextInt();
			if (num == 1) {
				assignmentmanage.Addassignment();
			}
			else if (num ==2 ) {
				assignmentmanage.Deleteassignment();
			}
			else if (num ==3 ) {
				assignmentmanage.Editassignment();
			}
			else if (num ==4 ) {
				assignmentmanage.Viewassignments();
			}
			else  {
				continue;
			}
		}
	}

}

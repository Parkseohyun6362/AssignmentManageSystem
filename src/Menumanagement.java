import java.util.InputMismatchException;
import java.util.Scanner;

public class Menumanagement {
	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		AssignmentManage assignmentmanage = new AssignmentManage(input);
		
		selectMenu(input, assignmentmanage);
	}
	
	public static void selectMenu(Scanner input,AssignmentManage assignmentmanage) {
		int num =-1;
		while(num != 5) {
			try {
				showMenu();
				num = input.nextInt();
				
				switch(num) {
				case 1:
					assignmentmanage.Addassignment();
					break;
				case 2:
					assignmentmanage.Deleteassignment();
					break;
				case 3:
					assignmentmanage.Editassignment();
					break;
				case 4:
					assignmentmanage.Viewassignments();
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e){
				System.out.println("Please put an integer between 1 and 5!");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}
	public static void showMenu() {
		System.out.println(" This is your studying planner ! ");
		System.out.println("1. Add assignment");
		System.out.println("2. Delete assignment");
		System.out.println("3. Edit assignment");
		System.out.println("4. View assignments");
		System.out.println("5. Exit");
		System.out.println("Select one number between 1 - 5 :");
	}
}

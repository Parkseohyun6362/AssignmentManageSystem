import java.util.Scanner;

public class AssignmentManage {
	Assignment assignment;
	Scanner input;
	AssignmentManage(Scanner input){
		this.input = input;
	}
	public void Addassignment() {
		assignment= new Assignment();
		System.out.print("subject :");
		assignment.subject = input.next();
		System.out.print("assignmentName :");
		assignment.assignmentname = input.next();
		System.out.print("assignment submission period :");
		assignment.period = input.next();
		System.out.print("assignment Submission method:");
		assignment.method = input.next();

	}

	public void Deleteassignment() {
		System.out.print("Assignmentname :");
		String assignmentName = input.next();
		if(assignment == null) {
			System.out.println("The assignment has not been registered.");
			return;
		}
		if (assignment.assignmentname.equals(assignmentName)) {
			assignment = null;
			System.out.println("the assignment is deleted");
		}
	}

	public void Editassignment() {
		System.out.print("Assignmentname :");
		String assignmentName = input.next();
		if (assignment.assignmentname.equals (assignmentName)) {
			System.out.println("the assignment to be edited is "+assignmentName );
		}
		int num =-1;
		
		while(num != 5) {
			System.out.println(" This is your studying planner ! ");
			System.out.println("1. Edit Subject");
			System.out.println("2. Edit assignmentName");
			System.out.println("3. Edit submissionperiod");
			System.out.println("4. View submissionmethod");
			System.out.println("5. Exit");
			System.out.println("Select one number between 1 - 5 :");
			num = input.nextInt();
			if (num == 1) {
				System.out.print("subject :");
				assignment.subject = input.next();
			}
			else if (num ==2 ) {
				System.out.print("assignment name :");
				assignment.assignmentname = input.next();
			}
			else if (num ==3 ) {
				System.out.print("assignment submission period :");
				assignment.period = input.next();
			}
			else if (num ==4 ) {
				System.out.print("assignment Submission method:");
				assignment.method = input.next();
			}
			else  {
				continue;
			}
		}
	}

	public void Viewassignment() {
		System.out.print("assignmentName :");
		String assignmentName = input.next();
		if (assignment.assignmentname.equals( assignmentName)) {
			assignment.printInfo();
		}
	}

	
}

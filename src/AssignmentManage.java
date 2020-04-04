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
		System.out.print("assignment name :");
		assignment.assignmentName = input.next();
		System.out.print("assignment submission period :");
		assignment.submissionperiod = input.nextInt();
		System.out.print("assignment Submission method:");
		assignment.submissionmethod = input.next();

	}

	public void Deleteassignment() {
		System.out.print("Assignmentname :");
		String assignmentName = input.next();
		if(assignmentName == null) {
			return;
		}
		if (assignment.assignmentName == assignmentName) {
			assignment = null;
			System.out.println("the assignment is deleted");
		}
	}

	public void Editassignment() {
		System.out.print("Assignmentname :");
		String assignmentName = input.next();
		if (assignment.assignmentName == assignmentName) {
			System.out.println("the assignment to be edited is "+assignmentName );
		}
	}

	public void Viewassignment() {
		System.out.print("assignmentName :");
		String assignmentName = input.next();
		if (assignment.assignmentName == assignmentName) {
			
		}
	}

	
}

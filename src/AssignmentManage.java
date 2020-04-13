import java.util.ArrayList;
import java.util.Scanner;

public class AssignmentManage {
	ArrayList<Assignment> assignments = new ArrayList<Assignment>();
	Scanner input;
	AssignmentManage(Scanner input){
		this.input = input;
	}
	public void Addassignment() {
		Assignment assignment= new Assignment();
		System.out.print("subject :");
		assignment.subject = input.next();
		System.out.print("assignmentName :");
		assignment.assignmentname = input.next();
		System.out.print("assignment submission period :");
		assignment.period = input.next();
		System.out.print("assignment Submission method:");
		assignment.method = input.next();
		assignments.add(assignment);
	}

	public void Deleteassignment() {
		System.out.print("Assignmentname :");
		String assignmentName = input.next();
		int index = -1;
		for(int i = 0; i<assignments.size();i++) {
			if (assignments.get(i).assignmentname.equals(assignmentName)) {
				index = i;
				break;
			}
		}
		if(index > 0) {
			assignments.remove(index);
			System.out.println("the assignment"+assignmentName +" is deleted");
		}
		else {
			System.out.println("The assignment has not been registered.");
			return;
		}
	}

	public void Editassignment() {
		System.out.print("Assignmentname :");
		String assignmentName = input.next();
		for(int i = 0; i<assignments.size();i++) {
			Assignment assignment = assignments.get(i);
			if (assignment.assignmentname.equals (assignmentName)) {
				int num =-1;
				while(num != 5) {
					System.out.println("* This is your studying planner ! *");
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
				break;
			}
	  	}
	}

	public void Viewassignments() {
//		System.out.print("assignmentName :");
//		String assignmentName = input.next();
		for(int i = 0; i<assignments.size();i++) {
			assignments.get(i).printInfo();
		}
	}
}

import java.util.ArrayList;
import java.util.Scanner;

import assignment.Assignment;
import assignment.Presentation;

public class AssignmentManage {
	ArrayList<Assignment> assignments = new ArrayList<Assignment>();
	Scanner input;
	AssignmentManage(Scanner input){
		this.input = input;
	}
	public void Addassignment() {
		int kind =0;
		Assignment assignment;
		while(kind !=1 && kind != 2) {
			System.out.print("1. for Presentation");
			System.out.print("2. for Write");
			System.out.print("Select Assignment kind: ");
			kind = input.nextInt();
			if(kind == 1) {
				assignment= new Assignment();
				assignment.getUserInput(input);
				assignments.add(assignment);
				break;
			}
			else if (kind ==2) {
				assignment= new Presentation();
				assignment.getUserInput(input);
				assignments.add(assignment);
				break;
			}
			else {
				System.out.print("Select num for Assignment kind between 1 and 2:");
			}
		}
	}

	public void Deleteassignment() {
		System.out.print("Assignmentname :");
		String assignmentName = input.next();
		int index = -1;
		for(int i = 0; i<assignments.size();i++) {
			if (assignments.get(i).getSubject().equals(assignmentName)) {
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
			if (assignment.getAssignmentname().equals (assignmentName)) {
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
						String subject = input.next();
						assignment.setSubject(subject);
					}
					else if (num ==2 ) {
						System.out.print("assignment name :");
						String assignmentname = input.next();
						assignment.setAssignmentname(assignmentname);
					}
					else if (num ==3 ) {
						System.out.print("assignment submission period :");
						String period = input.next();
						assignment.setPeriod(period);
					}
					else if (num ==4 ) {
						System.out.print("assignment Submission method:");
						String method = input.next();
						assignment.setMethod(method);
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

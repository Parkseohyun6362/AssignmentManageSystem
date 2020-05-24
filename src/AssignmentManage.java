import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import assignment.AssignmentInput;
import assignment.Assignmentkind;
import assignment.Normalassignment;
import assignment.Presentation;
import assignment.Write;

public class AssignmentManage implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8358588321279211657L;
	ArrayList<AssignmentInput> assignments = new ArrayList<AssignmentInput>();
	transient Scanner input;
	public void setScanner(Scanner input) {
		this.input = input;
	}
	AssignmentManage(Scanner input){
		this.input = input;
	}
	public void Addassignment() {
		int kind =0;
		AssignmentInput assignmentInput;
		while(kind <1 || kind > 3) {
			try {
				System.out.println("1. for normalassginment");
				System.out.println("2. for Presentation");
				System.out.println("3. for Write");
				System.out.print("Select num 1, 2, and3 Assignment kind: ");
				kind = input.nextInt();
				if(kind == 1) {
					assignmentInput= new Normalassignment(Assignmentkind.Normalassignment);
					assignmentInput.getUserInput(input);
					assignments.add(assignmentInput);
					break;
				}
				else if (kind ==2) {
					assignmentInput= new Presentation(Assignmentkind.Presentation);
					assignmentInput.getUserInput(input);
					assignments.add(assignmentInput);
					break;
				}
				else if (kind ==3) {
					assignmentInput= new Write(Assignmentkind.Write);
					assignmentInput.getUserInput(input);
					assignments.add(assignmentInput);
					break;
				}
				else {
					System.out.print("Select num for Assignment kind between 1 and 2:");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if(input.hasNext()) {
					input.next();
				}
				kind = -1;
			}
		}
	}

	public void Deleteassignment() {
		System.out.print("Assignmentname :");
		String assignmentName = input.next();
		int index = findIndex(assignmentName); 
		removefromAssignments(index,assignmentName);
	}
	
	public int findIndex(String assignmentName) {
		int index = -1;
		for(int i = 0; i<assignments.size();i++) {
			if (assignments.get(i).getSubject().equals(assignmentName)) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public int removefromAssignments(int index,String assignmentName) {
		if(index >= 0) {
			assignments.remove(index);
			System.out.println("the assignment"+assignmentName +" is deleted");
			return 1;
		}
		else {
			System.out.println("The assignment has not been registered.");
			return -1;
		}
	}

	public void Editassignment() {
		System.out.print("Assignmentname :");
		String assignmentName = input.next();
		for(int i = 0; i<assignments.size();i++) {
			AssignmentInput assignment = assignments.get(i);
			if (assignment.getAssignmentname().equals (assignmentName)) {
				int num =-1;
				while(num != 5) {
					showEditMenu();
					num = input.nextInt();
					switch (num) {
					case 1:
						assignment.setAssignmentSubject(input);
						break;
					case 2:
						assignment.setAssignmentName(input);
						break;
					case 3:
						assignment.setAssignmentPeriod(input);
						break;
					case 4:
						assignment.setAssignmentMethod(input);
						break;
					default:
						continue;
					}
				}//while
				break;
			}//if
	  	}//for
	}

	public void Viewassignments() {
		for(int i = 0; i<assignments.size();i++) {
			assignments.get(i).printInfo();
		}
	}
	
	public void showEditMenu() {
		System.out.println("* This is your studying planner ! *");
		System.out.println("1. Edit Subject");
		System.out.println("2. Edit assignmentName");
		System.out.println("3. Edit submissionperiod");
		System.out.println("4. View submissionmethod");
		System.out.println("5. Exit");
		System.out.println("Select one number between 1 - 5 :");
	}
}

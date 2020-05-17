package assignment;

import java.util.Scanner;

public class Write extends CommonPart {
	
	protected String another;
	
	public Write(Assignmentkind kind){
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setAssignmentSubject(input);
		setAssignmentName(input);
		setOnesubmissionMethod(input);
		setanothersubmissionMethod(input);
		setAssignmentPeriod(input);
	}
	
	public void setOnesubmissionMethod(Scanner input) {
		char answer = 'x';
		while(answer !='y' && answer !='Y' && answer !='n' && answer !='N') {
			System.out.print("Do you have submission method? (Y/N)");
			answer = input.next().charAt(0); 
			if (answer =='y'||answer == 'Y') {
				setAssignmentMethod(input);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				this.setMethod("");
				break;
			}
			else {
			}
		}
	}

	public void setanothersubmissionMethod(Scanner input) {
		char answer = 'x';
		while(answer !='y' && answer !='Y' && answer !='n' && answer !='N') {
			System.out.print("Do you have another submission method? (Y/N)");
			answer = input.next().charAt(0); 
			if (answer =='y'||answer == 'Y') {
				setAssignmentMethod(input);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				this.setMethod("");
				break;
			}
			else {
			}
		}
	}
	
	public void printInfo() {
		String kind1 = getkindString();
		System.out.println("kind: "+kind1+" Subject: "+ subject +" assignmentName: "+ assignmentname +" period : "+ period +" submissionmethod: "+ method+" anothersubmissionmethod: "+ method);
	}
	
}

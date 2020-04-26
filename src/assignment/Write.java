package assignment;

import java.util.Scanner;

public class Write extends Assignment {
	
	public Write(Assignmentkind kind){
		super(kind);
	}
	
	protected String another;
	
	public void getUserInput(Scanner input) {
		System.out.print("subject :");
		String subject = input.next();
		this.setSubject(subject);
		
		System.out.print("assignmentName :");
		String assignmentname = input.next();
		this.setAssignmentname(assignmentname);
		
		char answer = 'x';
		while(answer !='y' && answer !='Y' && answer !='n' && answer !='N') {
			System.out.print("Do you have submission method? (Y/N)");
			answer = input.next().charAt(0); 
			if (answer =='y'||answer == 'Y') {
				System.out.print("submission method: ");
				String method = input.next();
				this.setMethod(method);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				this.setMethod("");
				break;
			}
			else {
			}
		}
		
		answer = 'x';
		while(answer !='y' && answer !='Y' && answer !='n' && answer !='N') {
			System.out.print("Do you have another submission method? (Y/N)");
			answer = input.next().charAt(0); 
			if (answer =='y'||answer == 'Y') {
				System.out.print("what's the another method? ");
				String method = input.next();
				this.setMethod(method);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				this.setMethod("");
				break;
			}
			else {
			}
		}
		
		System.out.print("assignment Submission period:");
		String period = input.next();
		this.setPeriod(period);
	}
	public void printInfo() {
		String kind1 = "none";
		switch(this.kind) {
		case Presentation:
			kind1 = "Presentation"; 
			break;
		case Write:
			kind1 = "Write";
			break;
		case Summary:
			kind1 = "Summary";
			break;
		case RearchandDevelopment:
			kind1 = "R&D";
			break;
		case Solvetask:
			kind1 = "Solving";
			break;
		default:
		}
		System.out.println("kind: "+kind1+" Subject: "+ subject +" assignmentName: "+ assignmentname +" period : "+ period +" submissionmethod: "+ method+" anothersubmissionmethod: "+ method);
	}
}

package assignment;

import java.util.Scanner;

public class Presentation extends Assignment {
	
	public Presentation(Assignmentkind kind){
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("subject :");
		String subject = input.next();
		this.setSubject(subject);
		
		System.out.print("assignmentName :");
		String assignmentname = input.next();
		this.setAssignmentname(assignmentname);
		
		char answer = 'x';
		while(answer !='y' && answer !='Y' && answer !='n' && answer !='N') {
			System.out.print("Do you have Presentation Day? (Y/N)");
			answer = input.next().charAt(0);
			if (answer =='y'||answer == 'Y') {
				System.out.print("Presentation Day");
				String period = input.next();
				this.setPeriod(period);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				this.setPeriod("");
				break;
			}
			else {
			}
		}
		
		System.out.print("assignment Submission method:");
		String method = input.next();
		this.setMethod(method);
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
		System.out.println(" kind: "+kind1+" Subject: "+ subject +" assignmentName:"+ assignmentname +" Presatationday :"+ period +" Presentation method: "+ method);
	}
}


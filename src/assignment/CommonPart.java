package assignment;

import java.util.Scanner;

import Exceptions.PeriodFormatException;

public abstract class CommonPart extends Assignment {
	
	public CommonPart(Assignmentkind kind){
		super(kind);
	}
	
	@Override
	public abstract void getUserInput(Scanner input);

	@Override
	public void printInfo() {
		String kind1 = getkindString();
		System.out.println(" kind: "+kind1+" Subject: "+ subject +" assignmentName:"+ assignmentname +" Presatationday :"+ period +" Presentation method: "+ method);
	}

	public void setAssignmentPresentDaywithYN(Scanner input) {
		char answer = 'x';
		while(answer !='y' && answer !='Y' && answer !='n' && answer !='N') {
			System.out.print("Do you have Presentation Day? (Y/N)");
			answer = input.next().charAt(0);
			try {
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
			catch(PeriodFormatException e) {
				System.out.println("Incorrect Period Format. put the period that contains ~");
			}
		}
	}
	
}

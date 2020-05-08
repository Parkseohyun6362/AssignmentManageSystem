package assignment;

import java.util.Scanner;

public class Normalassignment extends Assignment {
	
	public Normalassignment(Assignmentkind kind){
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setAssignmentSubject(input);
		setAssignmentName(input);
		setAssignmentPeriod(input);
		setAssignmentMethod(input);
	}
	
	public void printInfo() {
		String kind1 = getkindString();
		System.out.println("kind: "+kind1+"Subject: "+ subject +"assignmentName:"+ assignmentname +"period :"+ period +"submissionmethod"+ method);
	}
}

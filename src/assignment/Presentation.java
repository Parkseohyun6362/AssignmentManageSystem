package assignment;

import java.util.Scanner;

public class Presentation extends CommonPart{
	
	public Presentation(Assignmentkind kind){
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setAssignmentSubject(input);
		setAssignmentName(input);
		setAssignmentPresentDaywithYN(input);
		setAssignmentMethod(input);
	}
	
}


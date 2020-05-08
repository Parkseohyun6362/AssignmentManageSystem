package assignment;

import java.util.Scanner;

public interface AssignmentInput {
	
	public void printInfo();
	
	public void setAssignmentname(String assignmentname);
	
	public void setMethod(String method);
	
	public void setSubject(String subject);
	
	public void setPeriod(String period);
	
	public String getAssignmentname();
	
	public String getSubject();
	
	public void getUserInput(Scanner input);
	
	public void setAssignmentSubject( Scanner input);
	
	public void setAssignmentName( Scanner input);
	
	public void setAssignmentPeriod( Scanner input);
	
	public void setAssignmentMethod(Scanner input);
	
}

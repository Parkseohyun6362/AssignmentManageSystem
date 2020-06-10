package assignment;

import java.util.Scanner;

import Exceptions.PeriodFormatException;

public interface AssignmentInput {
	
	public void printInfo();
	
	public String getAssignmentname();
	
	public void setAssignmentname(String assignmentname);
	
	public String getMethod();
	
	public void setMethod(String method);
	
	public String getSubject();
	
	public void setSubject(String subject);
	
	public String getPeriod();
	
	public void setPeriod(String period) throws PeriodFormatException;
	
	public void getUserInput(Scanner input);
	
	public void setAssignmentSubject( Scanner input);
	
	public void setAssignmentName( Scanner input);
	
	public void setAssignmentPeriod( Scanner input);
	
	public void setAssignmentMethod(Scanner input);
	
}

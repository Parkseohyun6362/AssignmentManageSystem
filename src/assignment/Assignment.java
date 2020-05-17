package assignment;

import java.util.Scanner;

import Exceptions.PeriodFormatException;

public  abstract class Assignment implements AssignmentInput{
	protected Assignmentkind kind = Assignmentkind.Solvetask ; 
	protected String subject;
	protected String assignmentname;
	protected String period;
	protected String method;
	
	
	
	public Assignment(){
	}
	
	public Assignment(Assignmentkind kind){
		this.kind = kind;
	}
	
	public Assignment(String subject, String assignmentname) {
		this.subject = subject;
		this.assignmentname = assignmentname;
	}
	
	public Assignment(Assignmentkind kind,String subject, String assignmentname,String period,String method) {
		this.kind = kind;
		this.subject = subject;
		this.assignmentname = assignmentname;
		this.period = period;
		this.method = method;
	}
	
	public Assignmentkind getKind() {
		return kind;
	}

	public void setKind(Assignmentkind kind) {
		this.kind = kind;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getAssignmentname() {
		return assignmentname;
	}

	public void setAssignmentname(String assignmentname) {
		this.assignmentname = assignmentname;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) throws PeriodFormatException {
		if(!period.contains("~") && !period.equals("")) {
			throw new PeriodFormatException();
		}
		
		this.period = period;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}
	
	public abstract void printInfo();
	
	public void setAssignmentSubject( Scanner input) {
		System.out.print(" subject :");
		String subject = input.next();
		this.setSubject(subject);
	}
	
	public void setAssignmentName(Scanner input) {
		System.out.print(" assignment name :");
		String assignmentname = input.next();
		this.setAssignmentname(assignmentname);
	}
	
	public void setAssignmentPeriod(Scanner input) {
		String period = "";
		while(!period.contains("~")) {
			System.out.print(" assignment submission period :");
			period = input.next();
			try {
				this.setPeriod(period);
			}catch(PeriodFormatException e) {
				System.out.println("Incorrect Period Format. put the period that contains ~");
			}
		}
	}
	
	public void setAssignmentMethod(Scanner input) {
		System.out.print(" assignment Submission method:");
		String method = input.next();
		this.setMethod(method);
	}
	
	public String getkindString() {
		String kind1 = "none";
		switch(this.kind) {
		case Normalassignment:
			kind1 = "Normalassignment";
			break;
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
		return kind1;
	}
		
}

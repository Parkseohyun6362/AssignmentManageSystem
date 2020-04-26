package assignment;

import java.util.Scanner;

public class Assignment {
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

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
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
		}
		System.out.println("kind: "+kind1+"Subject: "+ subject +"assignmentName:"+ assignmentname +"period :"+ period +"submissionmethod"+ method);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("subject :");
		String subject = input.next();
		this.setSubject(subject);
		System.out.print("assignmentName :");
		String assignmentname = input.next();
		this.setAssignmentname(assignmentname);
		System.out.print("assignment submission period :");
		String period = input.next();
		this.setPeriod(period);
		System.out.print("assignment Submission method:");
		String method = input.next();
		this.setMethod(method);
	}
}

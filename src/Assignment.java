
public class Assignment {
	String subject;
	String assignmentName;
	int submissionperiod;
	String submissionmethod;
	Assignment(){
		
	}
	
	public Assignment(String subject, String assignmentName) {
		this.subject = subject;
		this.assignmentName = assignmentName;
	}
	
	public Assignment(String subject, String assignmentName,int submissionperiod,String submissionmethod) {
		this.subject = subject;
		this.assignmentName = assignmentName;
		this.submissionperiod = submissionperiod;
		this.submissionmethod = submissionmethod;
	}
	public void printAssign() {
		System.out.println("Subject : "+this.subject+" "+"assignmentName :"+this.assignmentName+"period :"+this.submissionperiod+"submissionmethod"+this.submissionmethod);
	}
	
	
}

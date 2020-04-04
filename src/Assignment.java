
public class Assignment {
	String subject;
	String assignmentname;
	String period;
	String method;
	public Assignment(){
	}
	
	public Assignment(String subject, String assignmentname) {
		this.subject = subject;
		this.assignmentname = assignmentname;
	}
	
	public Assignment(String subject, String assignmentname,String period,String method) {
		this.subject = subject;
		this.assignmentname = assignmentname;
		this.period = period;
		this.method = method;
	}

	public void printInfo() {
		System.out.println("Subject: "+ subject +"assignmentName:"+ assignmentname +"period :"+ period +"submissionmethod"+ method);
	}
}

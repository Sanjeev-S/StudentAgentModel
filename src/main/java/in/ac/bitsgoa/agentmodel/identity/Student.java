package in.ac.bitsgoa.agentmodel.identity;

import in.ac.bitsgoa.agentmodel.practice.ConcreteSocialPractice;

public class Student implements Identity {
	private String message;
	private ConcreteSocialPractice csp;
	public Student() {
		csp = null;
	}
	public Student(String message){
	      this.message = message;
	   }

	// prints the message
	public String printMessage() {
		System.out.println(message);
		return message;
	}
	public void setContext() {
		System.out.println("Not Implemented yet");
	}
}

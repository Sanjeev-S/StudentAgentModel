package in.ac.bitsgoa.agentmodel.Identity;

public class Student {
	private String message;

	// Constructor
	// @param message to be printed

	public Student(String message){
	      this.message = message;
	   }

	// prints the message
	public String printMessage() {
		System.out.println(message);
		return message;
	}
}

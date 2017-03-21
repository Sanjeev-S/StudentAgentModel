/* 
Copyright (c) 2017, Qulice.com
Sanjeev, Prasad Talasila
All rights reserved.
This software is released under GPL 3.0
*/
package in.ac.bitsgoa.agentmodel.identity;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StudentTest {
	String message = "Hello World";
	Student student = new Student(message);

	@Test
	public void testPrintMessage() {
		assertEquals(message, student.printMessage());
	}
}

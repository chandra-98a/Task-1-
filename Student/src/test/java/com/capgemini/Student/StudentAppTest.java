package com.capgemini.Student;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class StudentAppTest {
	StudentApp studentApp;
	
@BeforeEach
public void init() {
	studentApp=new StudentApp();
}

@AfterEach
void cleanUp() {
	System.out.println("Done with the Student Details");
}

	@Test
	@DisplayName("getting the id of student")
	void testGetId() {
		 int expected=5;
		  
		  int actual= studentApp.getId();
		  assertEquals(expected,actual,"student id is correct"); 
	
	}


}

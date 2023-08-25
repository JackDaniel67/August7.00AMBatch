package org.base;

public class TestingClass {

	public void tc01() {
		System.out.println("Test1");
	}

	// To Create Private Constructor// Restrict Object Creation
	TestingClass() {

	}

	// To Declare Static Variable Based on Class name
	public static TestingClass objct;

	// To Declare Static Method // To Define Object for the Class
	public static TestingClass generateObject() {

		return (objct == null)?objct = new TestingClass(): objct;
	}

}

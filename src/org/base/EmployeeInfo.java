package org.base;

public class EmployeeInfo {
	public static void main(String[] args) {
		
		TestingClass t = TestingClass.generateObject();
		t.tc01();
		System.out.println(System.identityHashCode(t));
		
		TestingClass t2 = TestingClass.generateObject();
		t2.tc01();
		System.out.println(System.identityHashCode(t2));

		
	}
}
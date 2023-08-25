package org.base;

public class CompanyInfo {
	public static void main(String[] args) {
		TestingClass t = new TestingClass();
		t.tc01();
		System.out.println("t memory "+System.identityHashCode(t));
		
		TestingClass t2 = new TestingClass();
		t2.tc01();
		System.out.println("t2 memory "+System.identityHashCode(t2));
		
		//Test1
		//t2 memory 305623748
		
	}
}
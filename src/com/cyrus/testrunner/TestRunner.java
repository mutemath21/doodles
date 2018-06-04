package com.cyrus.testrunner;

public class TestRunner {
	public static void main(String[] args) {
		System.out.println("Hello world.");
		
		Person p = new Person();
		
		// Some testing on reflection
		System.out.println(p.getClass().getClassLoader().getParent());
	}
}

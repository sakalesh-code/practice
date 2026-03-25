package com.coreJava;

public class Test {
	public static void main(String args[]) {
		// System.out.println("hello world");
		String s1 = "Hello";
		Test t = new Test();
		String s3 = t.update(s1);
		System.out.println(s3);
		String s2 = s1.concat("w");
		System.out.println(s2);
	}

	public String update(String s) {
		s = s.concat(" World2");
		return s;
	}

}
//Keyword	Purpose
//static	Class-level sharing
//final		Prevent modification
//transient	Skip serialization
//volatile	Thread visibility
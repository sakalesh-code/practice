package com.coreJava;

public class Test {
	public static void main(String args[]) {
		//System.out.println("hello world");
		String s1 = "Hello";
		update(s1);
		System.out.println(s1);
	}
	static void update(String s) {
	    s = s.concat(" World");
	}

}
//Keyword	Purpose
//static	Class-level sharing
//final		Prevent modification
//transient	Skip serialization
//volatile	Thread visibility
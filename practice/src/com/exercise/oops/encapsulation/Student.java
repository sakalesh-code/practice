package com.exercise.oops.encapsulation;

class TestStudent {
	// Binding data and methods into a single unit is called Encapsulation
	// Encapsulation is achieved by making variables private and accessing them
	// through public getter and setter methods.
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setI(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class Student {
	public static void main(String[] args) {
		TestStudent ts = new TestStudent();
		ts.setI(1);
		ts.setName("Bulls eye");
		System.out.println(ts.getId());
		System.out.println(ts.getName());
	}

}

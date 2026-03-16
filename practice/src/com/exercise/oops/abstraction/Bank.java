package com.exercise.oops.abstraction;

//Abstraction = hide implementation, show only what is needed
// Abstraction can be achieved using abstract classes and interfaces. Abstract
// classes can have both abstract and concrete methods, while interfaces provide
// complete abstraction.
//	Feature				Interface		Abstract Class
//	default method		✅ Yes			❌ No
//	static method		✅ Yes			✅ Yes
//	Abstract method		✅ Yes			✅ Yes
//	Concrete method		✅ (via default)	✅
//	Can override static	❌ No			❌ No
public abstract class Bank {// abstract class example

	abstract double interestRate();

	Bank() {
		System.out.println("Bank constructor called...");
	}

	void branch() {
		System.out.println("bank has multiple branches");
	}

	public static void start() {
		System.out.println("started...");
	}
}

class Sbi extends Bank {

	@Override
	double interestRate() {
		// TODO Auto-generated method stub
		return 6.5;
	}

	Sbi() {
		System.out.println("Sbi constructor called...");
	}

}

class TestSbi {
	public static void main(String[] args) {
		Bank b = new Sbi();
		System.out.println(b.interestRate());
		b.branch();
		Bank.start();

	}
}

package com.exercise.oops.Polymorphism;

public class Calculator {
	// polymorphism means having many forms, It has two types,
	// 1. method overloading
	// 2. method overriding
	// Method overloading is compile-time polymorphism where multiple methods have
	// the same name but different parameters.
	int add(int a, int b) {
		return a + b;
	}

	int add(int a, int b, int c) {
		return a + b + c;
	}

	double add(double a, double b) {
		return a + b;
	}

}

class TestCalculator {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		int intValue = c.add(2, 3);
		int intValue1 = c.add(2, 3, 4);
		double doubleValue = c.add(2, 5);
		System.out.println(intValue);
		System.out.println(intValue1);
		System.out.println(c.add(2.5, 3.5));
		System.out.println(doubleValue);
	}
}

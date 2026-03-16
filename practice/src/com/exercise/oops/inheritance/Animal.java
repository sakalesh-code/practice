package com.exercise.oops.inheritance;

public class Animal {
	// Inheritance allows a child class to acquire properties and behaviors of a
	// parent class using extends.
	public void eat() {
		System.out.println("animal eats foood...");
	}

}

class Dog extends Animal {
	public void bark() {
		System.out.println("barking...");
	}
}

class TestAnimal {
	public static void main(String[] args) {
		Dog t = new Dog();
		t.eat();
		t.bark();
	}
}

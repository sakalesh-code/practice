package com.exercise.oops.Polymorphism;

public class Animal {
	// Method overriding is runtime polymorphism where a child class provides its
	// own implementation of a parent class method.
	public void sound() {
		System.out.println("Animal makes sound");
	}
}

class Dog extends Animal {
	public void sound() {
		System.out.println("barks");
	}
}

class TestAnimal {
	public static void main(String[] args) {
		Animal a = new Dog();
		a.sound();
	}

}

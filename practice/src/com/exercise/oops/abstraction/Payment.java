package com.exercise.oops.abstraction;

//Interface represents 100% abstraction (contract)
//Methods are public & abstract by default
//Interface variables are public static final because interfaces represent constants shared globally and must remain unchanged.
public interface Payment {// Interface example
	public void payment();

	public static void start() {
		System.out.println("started...");
	}

	public default void load() {
		System.out.println("loading...");
	}

}

class Upi implements Payment {

	@Override
	public void payment() {
		System.out.println("payment done using Upi");

	}

}

class Card implements Payment {

	@Override
	public void payment() {
		System.out.println("payment done using Card");

	}

}

class testPayment {
	public static void main(String[] args) {
		Payment upi = new Upi();
		upi.payment();

		Payment card = new Card();
		card.payment();

		Payment.start(); // static method
		upi.load(); // default method

	}
}

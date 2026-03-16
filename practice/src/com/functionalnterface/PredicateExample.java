package com.functionalnterface;

import java.util.function.Predicate;

public class PredicateExample {
	public static void main(String[] args) {

		// It's a functional interface introduced in Java 8,
		// located in the java.util.function package. It represents a boolean-valued
		// function of one argument, typically used for applying a condition or filter
		// to an object and returning true or false.

		// Check if number is even.

		// without lambda
		Predicate<Integer> p = new Predicate<Integer>() {

			@Override
			public boolean test(Integer n) {

				return n % 2 == 0;
			};
		};

		// with lambda
		Predicate<Integer> isEven = n -> n % 2 == 0;

		System.out.println(p.test(10));
		System.out.println(isEven.test(11));
	}
}
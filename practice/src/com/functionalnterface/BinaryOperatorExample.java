package com.functionalnterface;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
	// It's a part of the java.util.function package introduced since Java 8,
	// It represents a binary operator which takes two operands and operates on them
	// to produce a result.
	public static void main(String[] args) {

		// Combine two things
		BinaryOperator<Integer> s = new BinaryOperator<Integer>() {

			public Integer apply(Integer t, Integer u) {
				return t + u;
			}
		};
		System.out.println(s.apply(2, 3));

		// Find Maximum of Two Numbers
		BinaryOperator<Integer> max = new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer a, Integer b) {

				return a > b ? a : b;
			}

		};
		System.out.println(max.apply(5, 6));

		// Find Minimum of Two Numbers
		BinaryOperator<Integer> min = (a, b) -> a < b ? a : b;
		System.out.println(min.apply(7, 4));

	}
}

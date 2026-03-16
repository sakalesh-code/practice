package com.functionalnterface;

import java.util.function.Function;

public class FunctionExample {
	public static void main(String[] args) {
		// The function interface takes one argument and returns a result.
		// It is commonly used for transforming data.

		// Convert String → Length
		Function<String, Integer> f = new Function<String, Integer>() {

			@Override
			public Integer apply(String t) {
				// TODO Auto-generated method stub
				return t.length();
			}
		};
		System.out.println(f.apply("sak"));

		// Square of a Number
		Function<Integer, Integer> square = new Function<Integer, Integer>() {

			@Override
			public Integer apply(Integer t) {
				// TODO Auto-generated method stub
				return t * t;
			}
		};
		System.out.println(square.apply(2));

		// Convert String to UpperCase
		Function<String, String> up = s -> s.toUpperCase();
		System.out.println(up.apply("sakalesh"));

		// Extract First Character
		Function<String, Character> c = s -> s.charAt(0);
		System.out.println(c.apply("remo"));
	}
}

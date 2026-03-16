package com.functionalnterface;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierExample {
	public static void main(String[] args) {
		// It's a part of the java.util.function package introduced since Java 8,
		// to implement functional programming in Java.
		// It represents a function which does not take in any argument but produces a
		// value of type T.

		// Print random numbers
		Supplier<Double> s = new Supplier<Double>() {
			public Double get() {
				return Math.random();
			}
		};
		System.out.println(s.get());

		// Current Date & Time
		Supplier<LocalDateTime> t = new Supplier<LocalDateTime>() {
			public LocalDateTime get() {
				return LocalDateTime.now();
			}
		};
		System.out.println(t.get());

		// Generate Random Number (Very Common Interview Example)
		Supplier<Integer> i = new Supplier<Integer>() {
			public Integer get() {
				return new Random().nextInt(100);
			}
		};
		System.out.println(i.get());

		// with lambda
		Supplier<Integer> sup = () -> new Random().nextInt(1000000);
		System.out.println(sup.get());
	}
}

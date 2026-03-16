package com.functionalnterface;

import java.util.function.Consumer;

public class ConsumerExample {
	public static void main(String[] args) {
		// It represents a function which takes in one argument and produces a result.
		// However these kind of functions don't return any value

		// with lambda
		Consumer<Integer> c = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t);

			}
		};
		c.accept(1);

		// without lambda
		Consumer<String> s = a -> System.out.println(a);
		s.accept("Hello World");
		
//		| Interface      | Input | Output  | Remember As | present Method      |
//		| -------------- | ----- | ------- | ----------- | ------------------- |
//		| Predicate      | 1     | boolean | Yes/No      | boolean test(T t)   |
//		| Function       | 1     | 1       | Convert     | R apply(T t)        |
//		| Consumer       | 1     | void    | Use         | void accept(T t)    |
//		| Supplier       | 0     | 1       | Give        | T get()             |
//		| BinaryOperator | 2     | 1       | Combine     | R apply(T t, U u)   |

	}
}

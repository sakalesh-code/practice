package com.exception;

public class ExceptionExample {
	public static void main(String[] args) {
		// Exception disrupts the normal flow of execution
		// to handle that we use exception handling

		// Exceptions are two types 1.checked 2.unchecked
		// 1.checked exceptions are compile time exceptions, ex: i/o and sql exception
		// 2.unchecked exceptions are run time exceptions, ex: arithmetic and array out
		// of bound exception and null pointer and number format exception
		// you can handle exceptions either using try catch block or using throws

		// throws is used with the method, you can throw multiple exceptions at a time
		// throw is used with in the method, you can only throw one at a time (mostly
		// used for custom exceptions)

		// EXAMPLES
		// Handle divide by zero - ArithmeticException
		// i
		try {
			int a = 10 / 0;
			System.out.println(a);
		} catch (ArithmeticException e) {
			System.out.println("can not divide by 0");
		}
		// ii
		try {
			int b = 10 / 2;
			System.out.println(b);
		} finally {
			System.out.println("you can use finally block instead of catch");
		}

		// NullPointerException Practice
		// i
		String name = null;
		try {
			System.out.println(name.length());
		} catch (NullPointerException e) {
			System.out.println("string is null");
		}
		// ii
		String n = "sak";
		try {
			System.out.println(n.length());
		} catch (NullPointerException e) {
			System.out.println("string is null");
		}
		// Multiple Catch Blocks
		try {
			int[] arr = new int[3];
			System.out.println(arr[3]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("array index problem");
		} catch (Exception e) {
			System.out.println("general exception");
		}

		// throw
		int age = 20;
		if (age < 18) {
			throw new IllegalArgumentException("age must be 18+");
		}
		System.out.println("eligible");

		// throws
		try {
			ExceptionExample.checkNumber(1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		// A custom exception is a user-defined exception class created by extending
		// Exception or RuntimeException
		// It is used to handle specific business errors like InvalidAgeException
		// instead of using general exceptions.

	}

	public static void checkNumber(int num) throws Exception {
		if (num > 0) {
			throw new Exception("Number can not be negative");
		}
	}
}

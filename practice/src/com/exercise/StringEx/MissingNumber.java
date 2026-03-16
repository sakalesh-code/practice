package com.exercise.StringEx;

public class MissingNumber {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 5 };
		int n = arr.length + 1;
		int expected = n * (n + 1) / 2;
		int actual = 0;
		for (int i : arr) {
			actual += i;
		}
		System.out.println("missing number is : " + (expected - actual));
	}
}

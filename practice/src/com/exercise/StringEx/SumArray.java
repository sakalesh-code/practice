package com.exercise.StringEx;

public class SumArray {
	public static void main(String[] args) {
		int[] arr; // Declaration
		arr = new int[4]; // Allocation
		arr = new int[] { 1, 2, 3, 4 };// Initialization
		int[] arr1 = new int[] { 1, 2, 3, 4 };

		int[] arr2 = { 1, 2, 3, 4 }; // Curly braces can be used for direct initialization during declaration,
										// but for reassignment we must explicitly use new int[].

		// case 1
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		System.out.println(sum);
	}
}

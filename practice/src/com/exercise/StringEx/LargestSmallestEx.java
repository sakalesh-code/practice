package com.exercise.StringEx;

import java.util.Arrays;

public class LargestSmallestEx {
	public static void main(String[] args) {
		int[] arr = { 2, 5, 1, 9 };
		// case 1
		int largest = arr[0];
		int smallest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (largest < arr[i]) {
				largest = arr[i];
			}
			if (smallest > arr[i]) {
				smallest = arr[i];
			}
		}
		System.out.println("largest : " + largest);
		System.out.println("smallest : " + smallest);

		// case 2
		Arrays.sort(arr);
		System.out.println("smallest : " + arr[0]);
		System.out.println("largest : " + arr[arr.length - 1]);

	}
}

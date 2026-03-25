package com.exercise.StringEx;

import java.util.Arrays;

public class SecondLargest {
	public static void main(String[] args) {
		int[] arr = { 10, 30, 20, 20, 8 };

		// case 1
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for (int i : arr) {
			if (i > largest) {
				secondLargest = largest;
				largest = i;
			}
//			else if (i > largest && secondLargest != largest) {
//				secondLargest = i;
//				System.out.println("est : " + secondLargest);
//			}
		}
		System.out.println("largest : " + largest);
		System.out.println("secondLargest : " + secondLargest);
		// case 2
		Arrays.sort(arr);
		System.out.println(arr[arr.length - 2]);
	}
}

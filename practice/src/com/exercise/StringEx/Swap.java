package com.exercise.StringEx;

import java.util.Arrays;

public class Swap {
	public static void main(String[] args) {
		int a = 5;
		int b = 10;

		// Swap using temporary variable
		int temp = a;
		a = b;
		b = temp;
		System.out.println(a);
		System.out.println(b);

		// Swap without using third variable
		a = 4;
		b = 7;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a);
		System.out.println(b);

		// Swap characters in a String (using array)
		char[] arr = { 'a', 'b', 'c' };
		System.out.println(arr);
		char tmp = arr[0];
		arr[0] = arr[arr.length - 1];
		arr[arr.length - 1] = tmp;
		System.out.println(arr);

		// Swap array elements (IMPORTANT)
		// Swap first and last element of array.
		int[] ar = { 1, 2, 3, 4 };
		System.out.println(Arrays.toString(ar));
		int tem = ar[ar.length - 1];
		ar[ar.length - 1] = ar[0];
		ar[0] = tem;
		System.out.println(Arrays.toString(ar));

		// Reverse array (Two-Pointer Swap)
		int[] array = { 1, 2, 3, 4, 5,6 };
		System.out.println(Arrays.toString(array));
		int left = 0;
		int right = array.length - 1;
		while (left < right) {
			int tempvalue = array[left];
			array[left] = array[right];
			array[right] = tempvalue;
			left++;
			right--;
		}
		System.out.println(Arrays.toString(array));

	}
}

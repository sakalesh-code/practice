package com.exercise.StringEx;

import java.util.Arrays;

public class RemoveArrayDuplicates {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 6, 3, 4, 4 };
		int[] temp = new int[arr.length];
		int[] dup = new int[arr.length];
		Arrays.sort(arr);
		int j = 0;
		temp[j] = arr[0];
		int k = 0;
		for (int i = 1; i < arr.length; i++) {
			System.out.println("arr[" + i + "] (" + arr[i] + " != " + arr[i - 1] + ") arr[" + (i - 1) + "])");
			if (arr[i] != arr[i - 1]) {
				j++;
				temp[j] = arr[i];
			} else {
				dup[k] = arr[i];
				k++;
			}
		}
		System.out.println(Arrays.toString(Arrays.copyOf(temp, j + 1)));
		System.out.println(Arrays.toString(Arrays.copyOf(dup, k)));
	}
}

package com.collection.Set;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetExample3 {
	public static void main(String[] args) {
		// Find first non-repeating element Input : [10,20,10,30,20,40]
		List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 10, 30, 20, 40));
		Set<Integer> set = new HashSet<>();

		for (Integer num : list) {
			if (set.contains(num)) {
				set.remove(num);
				System.out.println("remove : " + num);
			} else {
				System.out.println(" add : " + num);
				set.add(num);
			}
		}
		System.out.println(set);
		for (int i : list) {
			if (set.contains(i)) {
				System.out.println(i);
				break;
			}
		}
		// Check if two arrays have common element Input [1,2,3] [5,6,3]
		int[] arr = { 5, 6, 3 };
		Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
		boolean found = false;
		for (int i : arr) {
			if (set1.contains(i)) {
				found = true;
				break;
			}
		}
		System.out.println("Check if two arrays have common element Input : " + found);

		// Find the missing numbers in a range. [1,2,4,6] Range = 1 to 6
		int[] arr1 = { 1, 2, 4, 6 };
		Set<Integer> set2 = new HashSet<>();
		int start = 1;
		int end = 6;
		for (int num : arr1) {
			set2.add(num);
		}
		System.out.println(set2);
		for (int i = start; i <= end; i++) {
			if (!set2.contains(i)) {
				System.out.println("missing number : " + i);
			}
		}
	}

}

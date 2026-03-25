package com.collection.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample2 {
	public static void main(String[] args) {
		// Remove Duplicates (Without Set)
		List<Integer> list = Arrays.asList(10, 20, 20, 30, 10, 40);
		List<Integer> originalList = new ArrayList<>();
		List<Integer> duplicateList = new ArrayList<>();
		for (int i : list) {
			if (!originalList.contains(i)) {
				originalList.add(i);
			} else {
				duplicateList.add(i);
			}
		}
		System.out.println("original : " + originalList);
		System.out.println("duplicate : " + duplicateList);

		// Exercise 5 — Reverse List (Without Collections.reverse)
		List<Integer> li = Arrays.asList(1, 2, 3, 4, 5);
		// Option 1 using new arrayList
		List<Integer> reverselist = new ArrayList<>();
		for (int i = li.size() - 1; i >= 0; i--) {
			reverselist.add(li.get(i));
		}
		System.out.println(reverselist);

		// Find Second Largest
		List<Integer> sl = Arrays.asList(10, 50, 30, 40, 20, 45);
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int num : sl) {

			if (num > largest) {
				System.out.println(num + " > " + largest);
				secondLargest = largest;
				largest = num;
			} else if (num > secondLargest && num != largest) {
				System.out.println(num + ">" + secondLargest + " && " + num + "!=" + largest);
				secondLargest = num;
			}
		}
		System.out.println("Second Largest = " + secondLargest);
		System.out.println("Largest = " + largest);

	}
}

package com.collection.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArraylistExample3 {
	public static void main(String[] args) {
		// Remove Even Numbers (Safely)
		// Option 1
		List<Integer> list = Arrays.asList(10, 15, 20, 25, 30);
		List<Integer> correctedList = new ArrayList<>();
		for (int i : list) {

			if (!(i % 2 == 0)) {
				correctedList.add(i);

			}
		}
		System.out.println(correctedList);
		// option 2 (Removing from same list safely)
		List<Integer> lst = new ArrayList<>(Arrays.asList(10, 15, 20, 25, 30));
		Iterator<Integer> it = lst.iterator();
		while (it.hasNext()) {
			if (it.next() % 2 == 0) {
				it.remove();
			}
		}
		System.out.println("using iterator" + lst);
		// Find Missing Number
		List<Integer> li = Arrays.asList(1, 2, 4, 5, 6);
		int n = li.size() + 1;
		int expectedNumber = n * (n + 1) / 2;
		int actualSum = 0;
		for (int num : li) {
			actualSum += num;
		}

		System.out.println(expectedNumber - actualSum);
		// Rotate List Right by 1
		List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		// Option 1
		int lastElement = list1.remove(list1.size() - 1);
		list1.add(0, lastElement);
		System.out.println(list1);
	}
}

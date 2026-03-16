package com.collection.Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetExample2 {
	public static void main(String[] args) {
		// Count unique elements : [1,2,2,3,3,3,4]
		List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 3, 3, 4));
		Set<Integer> set = new HashSet<>();
		int count = 0;
		for (int i : list) {
			if (set.add(i)) {
				count++;
			}
		}
		// System.out.println(set.size());
		System.out.println("Count unique elements : " + count);
		// Find common elements between two lists list1 = [1,2,3,4] list2 = [3,4,5,6]
		List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
		List<Integer> list2 = new ArrayList<>(Arrays.asList(3, 4, 5, 6));
		Set<Integer> set1 = new HashSet<>(list1);
		Set<Integer> set2 = new HashSet<>(list2);
		set1.retainAll(set2);
		System.out.println("common elements : " + set1);

		// Find union of two lists [1,2,3] [3,4,5]
		List<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3));
		List<Integer> list4 = new ArrayList<>(Arrays.asList(3, 4, 5));
		Set<Integer> unionSet = new HashSet<>();
		unionSet.addAll(list3);
		unionSet.addAll(list4);
		System.out.println("union of two lists : " + unionSet);
		// Find difference between two sets A = [1,2,3,4] B = [3,4,5]
		Set<Integer> setA = new HashSet<>(Arrays.asList(1, 2, 3, 4));
		Set<Integer> setB = new HashSet<>(Arrays.asList(3, 4, 5));
		setA.removeAll(setB);
		System.out.println("difference between two sets : " + setA);

	}
}

package com.collection.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

//S01131O8C0203261200013
public class ArrayListExample {
	// list is an interface it extends collection interface
	// It's part of java.util.package
	// It's used to store ordered collections with duplicates are allowed
	// List implementations are ArrayList, LinkedList, Vector, Stack
	public static void main(String[] args) {
		// ArrayList
		// ArrayList follows insertion order
		// ArrayList allows duplicates
		// ArrayList allows null values
		// Elements accessed by index
		// ArrayList is not thread-safe

		// Add numbers: 10, 20, 30, 40, 50
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(null);
		// Print all elements
		System.out.println(list);
		// Print size
		System.out.println("size : " + list.size());
		// Print element at index 2
		System.out.println("index 2 : " + list.get(2));

		// [5, 10, 15, 20, 25]
		List<Integer> l = new ArrayList<>(Arrays.asList(5, 10, 15, 20, 25, 30));
		Iterator<Integer> it = l.iterator();

		while (it.hasNext()) {
			int val = it.next();

			if (val == 5) {
				it.remove(); // ✅ safe
			}
		}
//		// Remove element 15
//		for (int i : l) {
//			System.out.println(i);
//			if (i == 15) {
//				l.remove(Integer.valueOf(i)); // java.util.ConcurrentModificationException
//			}
//		}
		l.remove(Integer.valueOf(15));
		l.removeIf(i -> i == 10);
		// l.remove(2);
		System.out.println(l);

		// Replace 20 with 200
		l.set(2, 200);
		// Print updated list
		System.out.println(l);

		// Sum of Elements [10, 20, 30, 40]
		List<Integer> li = Arrays.asList(10, 20, 30, 40);
		// For each loop
		int sum = 0;
		for (int i : li) {
			sum += i;
		}
		System.out.println(sum);
		// For loop
		int sumForLoop = 0;
		for (int i = 0; i < li.size(); i++) {
			sumForLoop += li.get(i);
		}
		System.out.println(sumForLoop);

	}
}

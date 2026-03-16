package com.collection.Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExample {
	// Set is an interface that stores unique collection of elements
	// Set does not allow duplicates because it uses hashing (hashCode() + equals())
	// internally.
	// No order guarantee
//	| Implementation    | Order                     | Internal Structure       |
//	| ----------------- | ------------------------- | ------------------------ |
//	| **HashSet**       | No order guarantee        | Hash table               |
//	| **LinkedHashSet** | Maintains insertion order | Hash table + linked list |
//	| **TreeSet**       | Sorted order              | Red-Black Tree           |

	public static void main(String[] args) {
		// Create a HashSet and add:10, 20, 30, 20, 10
		Set<Integer> set = new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(20);
		set.add(10);
		System.out.println(set);
		// Find duplicate elements in a list using Set.Input : [10,20,30,20,40,10];
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 20, 40, 10));
		System.out.println("list : " + list);
		Set<Integer> s = new HashSet<>();
		Set<Integer> dupSet = new HashSet<>();
		for (int i : list) {
			if (!s.add(i)) {
				dupSet.add(i);
			}
//			if (!s.contains(i)) {
//				s.add(i);
//			} else {
//				dup.add(i);
//			}
		}
		System.out.println("Set : " + s);
		System.out.println("duplicate Set : " + dupSet);
		// Remove duplicates using Set.Input : [1,2,2,3,3,4]
		// Order will not be preserved (Hash Set)
		List<Integer> original = new ArrayList<Integer>(Arrays.asList(5, 1, 2, 3, 2, 3, 4));
		Set<Integer> set1 = new HashSet<>(original);
		System.out.println("After removing duplicates Order will not be preserved : " + set1);
		// If Order Must Be Preserved (Linked Hash Set)
		Set<Integer> lSet = new LinkedHashSet<>(original);
		System.out.println("If Order Must Be Preserved : " + lSet);
		// If Order Must Be Sorted () (Tree Set)
		Set<Integer> tSet = new TreeSet<>(original);
		System.out.println("If Order Must Be Sorted : " + tSet);

	}
}

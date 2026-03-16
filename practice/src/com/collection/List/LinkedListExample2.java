package com.collection.List;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample2 {
	public static void main(String[] args) {
		// Print LinkedList in reverse order
		LinkedList<Integer> list = new LinkedList<>(Arrays.asList(10, 20, 30, 40));
		System.out.println(list.reversed());

		// option 2
		LinkedList<Integer> reversedList = new LinkedList<>();
		for (int i = list.size() - 1; i >= 0; i--) {
			System.out.println(list.get(i) + " ");
			reversedList.add(list.get(i));
		}
		System.out.println(list);
		System.out.println("reversedList : " + reversedList);
		// Check if LinkedList is Palindrome
		LinkedList<Integer> li = new LinkedList<Integer>(Arrays.asList(1, 2, 3, 2, 1));
		System.out.println(LinkedListExample2.isPalindrome(li));
	}

	public static boolean isPalindrome(List<Integer> li) {
		int left = 0;
		int right = li.size() - 1;
		while (left < right) {
			if (!li.get(left).equals(li.get(right))) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	// Vector is a legacy class in Java that implements the List interface and works
	// similar to ArrayList, but it is synchronized by default, which makes it
	// thread-safe. Because every method is synchronized, it has performance
	// overhead, so modern applications prefer ArrayList or CopyOnWriteArrayList
	// instead.
	// Stack is a class in Java that extends Vector and follows the LIFO (Last In
	// First Out) principle. The last element added is the first one removed.

//	| Type           | Internal Structure | Thread Safe | Order                     | Duplicates | Use Case                |
//	| -------------- | ------------------ | ----------- | ------------------------- | ---------- | ----------------------- |
//	| **ArrayList**  | Dynamic Array      | ❌ No        | Maintains insertion order | ✔ Yes      | Fast random access      |
//	| **LinkedList** | Doubly Linked List | ❌ No        | Maintains insertion order | ✔ Yes      | Frequent insert/delete  |
//	| **Vector**     | Dynamic Array      | ✔ Yes       | Maintains insertion order | ✔ Yes      | Legacy thread-safe list |
//	| **Stack**      | Vector based       | ✔ Yes       | LIFO order                | ✔ Yes      | Stack operations        |

}

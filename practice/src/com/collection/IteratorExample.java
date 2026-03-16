package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
	public static void main(String[] args) {
		// Remove all even numbers from list using Iterator. Input: [10,15,20,25,30]
		List<Integer> list = new ArrayList<>(Arrays.asList(10, 15, 20, 25, 30));
//		for (int i : list) {
//			if (i == 15) {
//				list.remove(list.indexOf(i));
//				// Fail-Fast: Collection throws ConcurrentModificationException if modified during iteration.
//				// ArrayList HashMap HashSet
//			}
//		}
//		System.out.println(list);// Exception in thread "main" java.util.ConcurrentModificationException

		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			if (iterator.next() == 15) {
				iterator.remove();
			}
		}
		System.out.println(list);
		// Fail-Safe : No exception because iteration works on a copy of the collection.
		// Examples ConcurrentHashMap CopyOnWriteArrayList
	}
}
//	| Feature     | Fail-Fast           | Fail-Safe         |
//	| ----------- | ------------------- | ----------------- |
//	| Exception   | Yes                 | No                |
//	| Iteration   | Original collection | Copy              |
//	| Performance | Faster              | Slightly slower   |
//	| Examples    | ArrayList, HashMap  | ConcurrentHashMap |

// ConcurrentModificationException
// Occurs when a collection is modified while iterating over it.
// Fail-fast iterators detect structural modification and throw this exception.

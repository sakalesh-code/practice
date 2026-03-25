package com.collection.List;

import java.util.LinkedList;

public class LinkedListExample {
	// ArrayList - Stores elements in a dynamically resizable array
	// [10][20][30].
	// LinkedList - Stores elements as nodes where each node contains references to
	// previous and next nodes 10 ⇄ 20 ⇄ 30 .

	// ArrayList - Uses a dynamic array where elements are stored contiguously in
	// memory.
	// LinkedList - Uses a doubly linked list where each element is stored in a node
	// connected by previous and next references.

//	Feature				ArrayList								LinkedList
//	Internal structure	Dynamic Array							Doubly Linked List
//	Storage				Elements stored continuously in memory	Elements stored as nodes connected with links
//	Access by index		Fast → O(1)								Slow → O(n)
//	Insert in middle	Slow (elements shift)					Faster
//	Delete in middle	Slow									Faster
//	Memory usage		Less memory								More memory (extra pointers)
	public static void main(String[] args) {
		// Create LinkedList: [10, 20, 30, 40]
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println("created linked list - " + list);
		// Add 5 at beginning and 50 at end
		list.addFirst(5);
		list.addLast(50);
		System.out.println("Add 5 at beginning and 50 at end - " + list);
		// Remove first and last element
		list.removeFirst();
		list.removeLast();
		System.out.println("Remove first and last element - " + list);
	}
}

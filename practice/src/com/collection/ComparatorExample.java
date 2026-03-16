package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
	public static void main(String[] args) {
		// Comparator Used for custom sorting
		// It uses compare() method
		// Separate class or lambda

		List<Student1> list = new ArrayList<>();
		list.add(new Student1(3, "Amit"));
		list.add(new Student1(1, "Sumit"));
		list.add(new Student1(2, "Mit"));
		// Collections.sort(list, new NameComparator());
		Collections.sort(list, new Comparator<Student1>() {
			@Override
			public int compare(Student1 s1, Student1 s2) {
				// TODO Auto-generated method stub
				return s1.name.compareTo(s2.name);
				// return s1.id - s2.id;
			}
		});

		// Collections.sort(list, (s1, s2) -> s1.name.compareTo(s2.name)); sort by name
		// Collections.sort(list, (s1, s2) -> s1.id - s2.id); sort by id
		// list.sort((s1, s2) -> s1.id - s2.id); using list
		// list.sort(Comparator.comparing(s -> s.name)); Using Comparator.comparing().
		for (Student1 s : list) {
			System.out.println(s.id + " " + s.name);
		}
	}
}

class Student1 {
	int id;
	String name;

	public Student1(int id, String name) {
		this.id = id;
		this.name = name;
	}
}
//
//class NameComparator implements Comparator<Student1> {
//
//	@Override
//	public int compare(Student1 s1, Student1 s2) {
//		// TODO Auto-generated method stub
//		// return s1.id - s2.id; // sort by Id
//		return s1.name.compareTo(s2.name); // sort by name
//
//	}
//
//}

package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {
	public static void main(String[] args) {
		// Comparable used for natural/default sorting
		// it uses compareTo() method
		// class itself decides sorting logic
		List<Student> list = new ArrayList<>();
		list.add(new Student(3, "Amit"));
		list.add(new Student(1, "Sumit"));
		list.add(new Student(2, "Mit"));
		Collections.sort(list);
		for (Student s : list) {
			System.out.println(s.id + " " + s.name);
		}
	}
}

class Student implements Comparable<Student> {

	int id;
	String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
		return this.id - s.id; // sort by Id
	}
}

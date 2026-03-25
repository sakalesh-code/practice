package com.collection.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StreamExample {
// 1. A Stream is a sequence of elements from a data source that supports functional-style operations to process data.
// 2. Stream processing has three stages:
//  -> Source (create stream) 
//	-> Intermediate operations (filter, map, sorted, peek)
//  -> Terminal operations (forEach, count).
// 3. Streams do not store data, they support lazy evaluation, and intermediate operations execute only when a terminal operation is invoked.
// 4. Streams cannot be reused once a terminal operation is executed.
	public static void main(String[] args) {
		// 1
		List<String> employees = Arrays.asList("John", "Alexandra", "Ben", "David", "Christina", "Amy");
		employees.stream()
			.filter(s -> s.length() >= 5)
			.map(String::toUpperCase)// .map(s -> s.toUpperCase())
			.sorted()
			.forEach(System.out::println);//.forEach(s -> System.out.println(s));
		System.out.println();
		
		// 2
		int[] numbers = {3,6,1,8,5,10,7};
		int count = (int) Arrays.stream(numbers)
				.filter(t-> t%2 == 1) // odd
				.map(t-> t*t).sorted()
				.peek(System.out::println)
				.count();
		System.out.println("count : "+count);
		System.out.println();
		
		// 3
		String sentence = "Our channel provides Amazing Automation content for Java and Selenium learners and proffessionals";
		//String[] str = sentence.split(" ");
		Arrays.stream(sentence.split(" "))
			.filter(s->s.toLowerCase().startsWith("a"))
			//.sorted((w1,w2) -> w1.length()-w2.length())
			.sorted(Comparator.comparing(String::length))
			.map(s -> new StringBuilder(s).reverse().toString().toLowerCase())
			.map(s->s +"-"+s.length())
			.forEach(System.out::println);
		System.out.println();
		
		// 4 find the common elements and list them in reverse alphabetical order
		String[] fruits = {"Apple","Banana","Avocado","Mango","Apricot"};
		Set<String> favoriteFruits = Set.of("Mango","Papaya","Avocado");
		
		Arrays.stream(fruits)
			.filter(f-> favoriteFruits.contains(f) || f.toLowerCase().contains("n"))
			.sorted(Comparator.reverseOrder())
			.forEach(System.out::println);
	
	}
}

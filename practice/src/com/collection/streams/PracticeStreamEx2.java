package com.collection.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PracticeStreamEx2 {
	public static void main(String[] args) {
// 1. Remove null values 👉 Input: [1, null, 2, null, 3] 👉 Output:[1, 2, 3]
		List<Integer> list = Arrays.asList(1, null, 2, null, 3);
		System.out.println(
				"After removing null values " + list.stream().filter(s -> s != null).collect(Collectors.toList()));
// 2. Find average of numbers 👉 Input: [10, 20, 30, 40] 👉 Output: 25.0
		int[] arr = { 10, 20, 30, 40 };
		List<Integer> list1 = Arrays.asList(10, 20, 30, 40);
		System.out.println(Arrays.stream(arr).average().orElse(0));
		System.out.println(list1.stream().collect(Collectors.averagingDouble(Integer::valueOf)));
// 3. Convert List<Integer> → List<String> 👉 Input: [1, 2, 3] 👉 Output: ["1", "2", "3"]	
		List<Integer> list3 = Arrays.asList(1, 2, 3);
		List<String> convertedList = list3.stream().map(String::valueOf).collect(Collectors.toList());
		System.out.println(convertedList);
// 4. Find length of each string 👉 Input: ["java", "stream"] 👉 Output: [4, 6]	
		List<String> list4 = List.of("java", "stream");
		System.out.println(list4.stream().map(String::length).collect(Collectors.toList()));
// 5. Find all palindromes in list👉 Input:["madam", "java", "level", "code"] 👉 Output: ["madam", "level"]
		List<String> list5 = Arrays.asList("madam", "java", "level", "code");
		System.out.println(list5.stream().filter(s -> s.equals(new StringBuilder(s).reverse().toString()))
				.collect(Collectors.toList()));
// 6. Find first element greater than 50 👉 Input: [10, 30, 60, 80]	👉 Output: 60
		List<Integer> list6 = Arrays.asList(10, 30, 60, 80);
		System.out.println(list6.stream().filter(num -> num > 50).findFirst().orElse(-1));
// 7. Skip first 3 elements 👉 Input: [1,2,3,4,5,6] 👉 Output: [4,5,6]	
		List<Integer> list7 = Arrays.asList(1, 2, 3, 4, 5, 6);
		System.out.println(list7.stream().skip(3).collect(Collectors.toList()));
// 8. Limit to first 2 elements 👉 Input: [10,20,30,40] 👉 Output: [10,20]		
		List<Integer> list8 = Arrays.asList(10, 20, 30, 40);
		System.out.println(list8.stream().limit(2).collect(Collectors.toList()));
// 9. Check if list contains duplicates 👉 Input: [1,2,3,4,2] 👉 Output: true		
		List<Integer> list9 = Arrays.asList(1, 2, 3, 4, 2);
		Set<Integer> set = new HashSet<>();

		boolean hasDuplicate = list9.size() != list9.stream().distinct().count();
		System.out.println("list contains duplicates : " + hasDuplicate);
		System.out.println(list9.stream().anyMatch(e -> !set.add(e)));
// 10. Find intersection of two lists 👉 Input: List1: [1,2,3,4] List2: [3,4,5,6] 👉 Output: [3,4]	
		List<Integer> listA = Arrays.asList(1, 2, 3, 4);
		List<Integer> listB = Arrays.asList(3, 4, 5, 6);

		System.out.println("uninon of elements : "
				+ Stream.concat(listA.stream(), listB.stream()).distinct().collect(Collectors.toList()));
		System.out.println(
				"intersection of elements : " + listA.stream().filter(listB::contains).collect(Collectors.toList()));
// 12. Find elements starting with "A" 👉 Input: ["Apple", "Banana", "Avocado"] 👉 Output: ["Apple", "Avocado"]	
		List<String> list12 = Arrays.asList("Apple", "Banana", "Avocado");
		System.out.println(list12.stream().filter(s -> s.startsWith("A")).collect(Collectors.toList()));
// 13. Sort strings by length 👉 Input: ["java", "a", "stream"] 👉 Output: ["a", "java", "stream"]	
		List<String> list13 = Arrays.asList("java", "a", "stream");
		System.out.println(list13.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList()));
// 14. Reverse each string 👉 Input: ["abc", "java"] 👉 Output: ["cba", "avaj"]
		List<String> list14 = Arrays.asList("abc", "java");
		System.out.println(
				list14.stream().map(e -> new StringBuilder(e).reverse().toString()).collect(Collectors.toList()));
// 15. Find most frequent element 👉 Input: [1,2,2,3,3,3,4] 👉 Output: 3		
		List<Integer> list15 = Arrays.asList(1, 2, 2, 3, 4, 4, 4);
		System.out.println(list15.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey());
// 16. Find all elements with frequency > 1 👉 Input: [1,2,2,3,3,4]👉 Output: [2,3]		
		List<Integer> list16 = Arrays.asList(1, 2, 2, 3, 3, 4);
		System.out.println(list16.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream().filter(e -> e.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList()));
// 17. Group strings by length 👉 Input: ["a", "bb", "ccc", "dd"] 👉 Output:{  1=[a],  2=[bb, dd], 3=[ccc] }	
		List<String> list17 = Arrays.asList("a", "bb", "ccc", "dd");
		System.out.println(list17.stream().collect(Collectors.groupingBy(String::length)));
// 18. Find sum of digits of all numbers 👉 Input: [12, 34, 56] 👉 Output: 21   // (1+2+3+4+5+6)		
		List<Integer> list18 = Arrays.asList(12, 34, 56);
		System.out.println(list18.stream().collect(Collectors.summingInt(Integer::valueOf)));
		System.out.println(
				list18.stream().flatMap(n -> String.valueOf(n).chars().mapToObj(c -> c - '0')).mapToInt(e -> e).sum());
// 19. Find second smallest number 👉 Input: [5,1,2,3,4] 👉 Output: 2
		List<Integer> list19 = Arrays.asList(5, 1, 2, 3, 4);
		System.out.println(list19.stream().sorted().skip(1).findFirst().orElse(-1));
// 20. Partition strings by length > 3 👉 Input: ["java", "go", "python", "c"] 👉 Output: { true=[java, python], false=[go, c] }	
		List<String> list20 = Arrays.asList("java", "go", "python", "c");
		System.out.println(list20.stream().collect(Collectors.partitioningBy(s -> s.length() > 3)));
		System.out.println(list20.stream()
				.collect(Collectors.groupingBy(s -> s.length() > 3, LinkedHashMap::new, Collectors.toList())));
	}
}

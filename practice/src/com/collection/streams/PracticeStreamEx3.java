package com.collection.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PracticeStreamEx3 {
	public static void main(String[] args) {
// 1. Find last element of list 👉 Input: [10, 20, 40, 20]
		List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 40, 20));
		System.out.println(list.stream().map(e -> list.get(list.size() - 1)).findFirst().orElse(-1));
// 3. Count vowels in all strings 👉 Input: ["java", "stream"] 👉 Output: 4
		Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');

		String[] list3 = { "java", "stream" };
		System.out.println(Arrays.stream(list3).flatMapToInt(c -> c.chars()).mapToObj(c -> (char) c)
				.filter(c -> vowels.contains(Character.toLowerCase(c))).count());
// 4. Remove duplicates but preserve order 👉 Input: [3,1,2,3,2,1] 👉 Output: [3,1,2]		
		List<Integer> list4 = new ArrayList<>(Arrays.asList(3, 1, 2, 3, 2, 1));
		System.out.println(list4.stream().distinct().collect(Collectors.toList()));
// 5. Find numbers divisible by both 3 and 5 👉 Input:[10,15,20,30,45] 👉 Output: [15,30,45]		
		List<Integer> list5 = new ArrayList<>(Arrays.asList(10, 15, 20, 30, 45));
		System.out.println(list5.stream().filter(n -> (n % 3 == 0) && (n % 5 == 0)).collect(Collectors.toList()));
// 6. Find pair with given sum 👉 Input: List: [2,4,3,5,7] Target: 9 👉 Output: [(2,7), (4,5)]
// 7. Find first repeated element 👉 Input: [1,2,3,4,2,5] 👉 Output: 2		
		List<Integer> list7 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 2, 5));
		Set<Integer> seen = new HashSet<>();
		Set<Integer> seen1 = new HashSet<>();
		System.out.println(list7.stream()
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(e -> e.getValue() > 1).map(Map.Entry::getKey).findFirst().orElse(-1));
		for (int i : list7) {
			if (!seen.add(i)) {
				System.out.println("first repeated element is " + i);
				break;
			}
		}
		System.out.println(list7.stream().filter(n -> !seen1.add(n)).findFirst().orElse(-1));
// 8. Convert list of objects → Map with grouping 👉 Input: Employee(name, dept) 👉 Output: Map<String, List<String>> 👉 Expected Output: { IT=[Sak, John],HR=[Ram], Finance=[Anu] }
		List<Employee2> employees = Arrays.asList(new Employee2("Sak", "IT"), new Employee2("Ram", "HR"),
				new Employee2("John", "IT"), new Employee2("Anu", "Finance"));
		System.out.println(employees.stream().collect(Collectors.groupingBy(Employee2::getDept)));
		System.out.println(employees.stream().collect(Collectors.groupingBy(Employee2::getDept,Collectors.mapping(Employee2::getName, Collectors.toList()))));
// 9. Sort map by values 👉 Input: {A=3, B=1, C=2} 👉 Output: {B=1, C=2, A=3}	
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 3);
		map.put("B", 1);
		map.put("C", 2);
		System.out.println(map.entrySet().stream()
				// .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()) // reversed
				// .sorted(Map.Entry.<String, Integer>comparingByValue())
				.sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new)));
		// map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
// 10. Find longest word in sentence 👉 Input: "Java streams are powerful" 👉 Output: "powerful"	
		String str = "Java streams are powerful";
		System.out.println(Arrays.stream(str.split(" ")).max(Comparator.comparingInt(String::length)).orElse(""));
		
	}
}

class Employee2 {
	String name;
	String dept;

	public Employee2(String name, String dept) {
		this.name = name;
		this.dept = dept;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee2 [name=" + name + "]";
	}

}

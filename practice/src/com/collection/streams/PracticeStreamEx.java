package com.collection.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PracticeStreamEx {
	public static void main(String[] args) {
//1. Filter even numbers 👉 Input: [1,2,3,4,5,6] 👉 Output: [2,4,6]
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
		List<Integer> evenNumbers = numbers.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
		System.out.println(evenNumbers);

//2. Convert list of strings to upper case 👉 Input: ["java","stream"] 👉 Output: ["JAVA","STREAM"]	
		List<String> strList = new ArrayList<>(Arrays.asList("java", "stream")); // List.of("java", "stream");
		List<String> upperCaseList = strList.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(upperCaseList);
//3. Find sum of all elements 👉 Input: [1,2,3,4] 👉 Output: 10	
		int[] array = { 1, 2, 3, 4 };
		// int sum = Arrays.stream(array).reduce((l, r) -> l + r).orElse(0);
		int sum = Arrays.stream(array).sum();
		System.out.println("sum : " + sum);
//4. Count elements greater than 10 👉 Input: [5,12,18,3] 👉 Output: 2	
		int[] arr = { 5, 12, 18, 3 };
		long count = Arrays.stream(arr).filter(num -> num > 10).count();
		System.out.println(count);
//5. Sort a list 👉 Input: [5,2,8,1] 👉 Output: [1,2,5,8]
		List<Integer> sortList = List.of(5, 2, 8, 1);
		System.out.println("sorted : " + sortList.stream().sorted().collect(Collectors.toList()));
//6. Find first non-repeated character 👉 Input: "stress" 👉 Output: "t"
		String str = "stress";
		Character ch = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(e -> e.getValue() == 1).map(e -> e.getKey()).findFirst().orElse(null);
		System.out.println("first non-repeated character : " + ch);
//7. Find duplicate elements 👉 Input: [1,2,3,2,4,1] 👉 Output: [1,2]	
		List<Integer> l = List.of(1, 2, 3, 2, 4, 1);
		Set<Integer> seen = new HashSet<>();
		Set<Integer> duplicateSet = l.stream().filter(s -> !seen.add(s)).collect(Collectors.toSet());
		System.out.println("duplicateSet : " + duplicateSet);
//8. Find max and min 👉 Input: [10,20,5,30] 👉 Output: max=30, min=5	
		// 1
		int[] intArray = { 10, 20, 5, 30 };
		int min = Arrays.stream(intArray).min().orElse(-1);
		int max = Arrays.stream(intArray).max().orElse(0);
		System.out.println(min);
		System.out.println(max);
//9. Group employees by department
		List<Employee1> empList = new ArrayList<>();
		empList.add(new Employee1("Amit", "IT"));
		empList.add(new Employee1("Bruno", "HR"));
		empList.add(new Employee1("Cameron", "IT"));
		System.out.println(empList.stream().collect(Collectors.groupingBy(Employee1::getDept)).toString());
		System.out.println("employee List : " + empList.stream().collect(Collectors.groupingBy(Employee1::getDept,
				Collectors.mapping(Employee1::getName, Collectors.toList()))));
//10. Count frequency of each element 👉 Input: [1,2,2,3,3,3] 👉 Output: {1=1,2=2,3=3}
		List<Integer> input = List.of(1, 2, 2, 3, 3, 3);
		System.out.println("Each element frequency : " + input.stream().collect(Collectors.groupingBy(s -> s)));
		System.out.println("Count frequency of each element : "
				+ input.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
//11. Find second highest number 👉 Input: [10,20,30,40] 👉 Output: 30	
		List<Integer> ar = List.of(10, 20, 30, 40);
		int secongHighest = ar.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(-1);
		System.out.println(secongHighest);
// 12. Flatten nested list 👉 Input: [[1,2],[3,4],[5]] 👉 Output: [1,2,3,4,5]
//		List<List<Integer>> nestedList = new ArrayList<>();
//		nestedList.add(new ArrayList<>(Arrays.asList(1, 2)));
//		nestedList.add(new ArrayList<>(Arrays.asList(3, 4)));
//		nestedList.add(new ArrayList<>(Arrays.asList(5)));
		List<List<Integer>> nestedList = List.of(List.of(1, 2), List.of(3, 4), List.of(5));
		System.out.println(nestedList.stream().flatMap(List::stream).collect(Collectors.toList()));
//13. Partition numbers into even & odd 👉 Output: true -> even false -> odd
		List<Integer> fullList = List.of(1, 2, 4, 5, 9, 12);
		System.out.println(fullList.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0)));
//14. Find longest string 👉 Input: ["java","stream","api"] 👉 Output: "stream"	
		List<String> longestlist = List.of("java", "stream", "api");
		System.out.println(longestlist.stream().max(Comparator.comparing(String::length)).orElse(""));
//15. Find top 3 highest numbers 👉 Input: [5,9,1,7,3,8] 👉 Output: [9,8,7]		
		List<Integer> highestNumberList = List.of(5, 9, 1, 7, 3, 8);
		System.out.println(highestNumberList.stream().sorted(Comparator.reverseOrder()).limit(3).toList());
//16. Find employees with highest salary per department

		List<Employee1> employees = List.of(new Employee1("A", "IT", 50000), new Employee1("B", "IT", 70000),
				new Employee1("C", "HR", 40000), new Employee1("D", "HR", 60000), new Employee1("E", "Sales", 45000));
		System.out.println(employees.stream().collect(Collectors.groupingBy(Employee1::getDept, Collectors
				.collectingAndThen(Collectors.maxBy(Comparator.comparing(Employee1::getSalary)), Optional::get))));
//17. Check if all elements match condition 👉 Example: all numbers > 0 Concepts:	
		List<Integer> list = List.of(5, 10, 15, 20);
		System.out.println("allmatch " + list.stream().allMatch(n -> n > 0));
		System.out.println("anymatch " + list.stream().anyMatch(n -> n > 18));
		System.out.println("noneMatch " + list.stream().noneMatch(n -> n < 0));
//18. Join strings with delimiter 👉 Input: ["A","B","C"] 👉 Output: "A,B,C" Concepts: Collectors.joining	
		List<String> list1 = List.of("A", "B", "C");
		String str1 = list1.stream().collect(Collectors.joining(","));
		System.out.println(str1);
//19. Convert List → Map 👉 Key = name, Value = length Concepts: Collectors.toMap	
		List<String> list2 = List.of("Java", "Stream", "API");
		Map<String, Integer> map = list2.stream().collect(Collectors.toMap(Function.identity(), String::length));
		System.out.println(map);
//20. 20. Kth Smallest Element List<Integer> list = List.of(7, 10, 4, 3, 20, 15); int k = 3;
		List<Integer> list3 = List.of(7, 10, 4, 3, 20, 15);
		int k = 3;
		System.out.println("Kth Smallest Element : " + list3.stream().sorted().skip(k - 1).findFirst().orElse(-1));
	}

}

class Employee1 {
	String name;
	String dept;
	int salary;

	Employee1(String name, String dept) {
		this.name = name;
		this.dept = dept;
	}

	Employee1(String name, String dept, int salary) {
		this.name = name;
		this.dept = dept;
		this.salary = salary;
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee1 [name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}

}

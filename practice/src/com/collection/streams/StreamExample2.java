package com.collection.streams;

import java.util.Arrays;
import java.util.List;

public class StreamExample2 {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee("Arjun", 28000), new Employee("Meera", 52000),
				new Employee("Rahul", 61000), new Employee("Divya", 47000), new Employee("Karan", 75000),
				new Employee("Neha", 82000));

//		employees.stream().filter(e -> e.getSalary() > 50000).map(e -> {
//			double salary = e.getSalary();
//			double bonus = salary <= 30000 ? salary * 0.15 : salary <= 75000 ? salary * 0.125 : salary * 0.10;
////			double bonus;
////			if(salary < 30000) {
////				bonus = salary * 0.15;
////			}else if( salary > 30000 && salary < 75000) {
////				bonus = salary * 0.125;
////			} else {
////				bonus = salary * 0.10;
////			}
//			return e.getName() + "-" + (salary + bonus);
//
//		}).forEach(System.out::println);
		employees.stream()
				.filter(e -> e.getSalary() > 50000)
				.map(e -> e.getName() + "-" + (e.getSalary() + calculateBonus(e.getSalary())))
				.forEach(System.out::println);
		int count = (int) employees.stream().filter(e -> e.getSalary() > 50000).count();
		System.out.println("count : " + count);

	}

	static double calculateBonus(double salary) {
		if (salary <= 30000)
			return salary * 0.15;
		if (salary <= 75000)
			return salary * 0.125;
		return salary * 0.10;
	}

}

class Employee {
	String name;
	double salary;

	Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}

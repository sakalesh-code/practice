package com.collection.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class StreamExample3 {
	public static void main(String[] args) {
// You have a collection of numbers with some duplicates. Remove the duplicates and keep only the first 4 unique numbers as an array. Output: [5, 2, 8, 9]
		int[] original = { 5, 2, 8, 9, 5, 2, 8, 9, 1 };
		int[] arr = Arrays.stream(original).distinct().limit(4).toArray();
		// int[] arr = IntStream.generate(() -> new
		// Random().nextInt(10)).distinct().limit(4).toArray();
		System.out.println(Arrays.toString(arr));
		System.out.println();

// Given an array of integers, find all distinct even numbers greater than 10. Convert them to strings, skip the first two results, limit the output to three, and collect them into an array. 
//      Input: int[] numbers = {5, 12, 14, 18, 20, 12, 24, 26, 28, 30}; Output: ["20", "24", "26"]
		int[] numbers = { 5, 12, 14, 18, 20, 12, 24, 26, 28, 30 };
		String[] evenNumbers = Arrays.stream(numbers).filter(n -> n > 10 && n % 2 == 0).distinct()
				.mapToObj(String::valueOf).skip(2).limit(3).toArray(String[]::new);
		System.out.println(Arrays.toString(evenNumbers));
		System.out.println();

// From a list of city names, select the unique cities whose names start with the letter 'S'. 
// Convert them to uppercase, skip the first one, then print the rest in the original order.
//		Input:
//		List<String> cities = Arrays.asList("Surat", "Shillong", "Srinagar", "Secunderabad", "Surat", "Salem");
//		Output:
//		SHILLONG
//		SRINAGAR
//		SECUNDERABAD
//		SALEM		
		List<String> cities = Arrays.asList("Surat", "Shillong", "Srinagar", "Secunderabad", "Surat", "Salem");
		cities.stream().distinct().skip(1).forEach(System.out::println);
		System.out.println();

// Given a string, extract all characters, skip the first five characters, take the next 10 characters, 
// convert each character to its Unicode integer value, find the distinct values, then collect them into an integer array.
//		Input:
//		String sentence = "Stream operations are powerful!";
//		Output:
//		[111, 112, 101, 114, 97, 116, 105, 111, 110, 115]
		String sentence = "Stream operations are powerful!";
		int[] array = sentence.replace(" ", "").chars().skip(5).limit(10).distinct().toArray();
		System.out.println(Arrays.toString(array));
		System.out.println();

// Given an array of double values representing temperatures, find distinct values above 30.0, 
// skip the first one, limit the next three convert them to strings with "°C" suffix, and collect into an array.
//		Input:
//		double[] temps = {28.5, 31.2, 35.0, 33.8, 31.2, 36.5, 38.0, 40.1};
//		Output:
//		["35.090", "33.8°C", "36.5°C"]
		double[] temps = { 28.5, 31.2, 35.0, 33.8, 31.2, 36.5, 38.0, 40.1 };
		Object[] str = Arrays.stream(temps).filter(t -> t > 30).distinct().skip(1).limit(3).mapToObj(t -> t + "°C")
				.toArray();
		System.out.println(Arrays.toString(str));
		System.out.println();

// From a list of hero names, find those with length between 4 and 7 (inclusive), remove duplicates, 
// convert them to lowercase, and print them in alphabetical order.
//		Input:
//		List<String> heroes = Arrays.asList("Prabhas", "Mahesh", "Jr NTR", "Balayya", "Mahesh", "Yash", "Prabhas");
//		Output:
//		balayya
//		jr ntr
//		mahesh
//		prabhas
//		yash		
		List<String> heroes = Arrays.asList("Prabhas", "Mahesh", "Jr NTR", "Balayya", "Mahesh", "Yash", "Prabhas",
				"mahesh");
		heroes.stream().filter(n -> n.length() >= 4 && n.length() <= 7).map(String::toLowerCase).distinct().sorted()
				.forEach(System.out::println);
		System.out.println();

// From a list of missile names, convert all names to uppercase, skip the first 3 names, 
// then take the next 5 unique names and print them.
//		Input
//		List<String> missiles = Arrays.asList( "Agni", "Prithvi", "BrahMos", "Nirbhay", "Akash", "Trishul", "Pralay", "Astra", "Sagarika", "Prahaar");
//		Output:
//		NIRBHAY
//		AKASH
//		TRISHUL
//		PRALAY
//		ASTRA		
		List<String> missiles = Arrays.asList("Agni", "Prithvi", "BrahMos", "Nirbhay", "Akash", "Trishul", "Pralay",
				"Astra", "Sagarika", "Prahaar");
		missiles.stream().map(String::toUpperCase).skip(3).distinct().limit(5).forEach(System.out::println);
	}
}

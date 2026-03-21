package com.collection.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.BinaryOperator;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class StreamExample4 {
	public static void main(String[] args) {

//	You are given a sentence that contains several numbers separated by spaces. 
//	Extract all the numbers and find the smallest one.
//		Input: String input = "45 32 67 89 12 90 5 100";
//		Output: Smallest number is: 5
		String input = "45 32 67 89 12 90 5 100";
		String[] array = input.split(" ");
//		ToIntFunction<String> to = new ToIntFunction<String>() {
//
//			@Override
//			public int applyAsInt(String value) {
//				// TODO Auto-generated method stub
//				return Integer.parseInt(value);
//			}
//		};
		OptionalInt min = Arrays.stream(array).mapToInt(Integer::parseInt).min();
		System.out.println(min.orElse(0));

//	You are given a sentence with multiple words. Find the word with the maximum number of characters (longest word)
//		Input: String sentence = "Coding with Streams is Excellent and super fun";
//		Output: Longest word: Excellent (9 characters)
		String sentence = "Coding with Streams is Excellent and super fun";
		String[] arr = sentence.split(" ");
//		Comparator<String> comp = new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				// TODO Auto-generated method stub
//				//return o1.length() - o2.length();
//				return Integer.compare(o1.length(), o2.length());
//			}
//		};
		String longestWord = Arrays.stream(arr).max(Comparator.comparingInt(String::length)).orElse("");
		System.out.println("Longest word: " + longestWord + " (" + longestWord.length() + " characters)");

//	You are given an array of integers. Find the first even number that is greater than 10.
//		Input: int[] numbers = {3, 7, 9, 12, 8, 15, 22};
//		Output: First even number > 10 is 12
		int[] numbers = { 3, 7, 9, 12, 8, 15, 22 };
		OptionalInt evenNumber = Arrays.stream(numbers).filter(n -> n % 2 == 0 && n > 10).findFirst();
		System.out.println("First even number > 10 is " + evenNumber.orElse(-1));

//	From a list of names, find any name that starts with the letter 'S'. The search should be case-insensitive.
//		Input: List<String> names = List of("Alice", "Steve", "bob", "Sandra", "Mark");
//		Output: Name starting with S: Steve
		List<String> names = List.of("Alice", "Steve", "bob", "Sandra", "Mark");
		String name = names.stream().filter(n -> n.toLowerCase().startsWith("s")).findAny().orElse("");
		System.out.println("Name starting with S: " + name);

//	You are given a string that contains digits mixed with letters. Extract all digits and calculate the sum of all digits.
//		Input: String input = "a1b2c3d4e5";
//		Output: Sum of digits: 15
		String inputWord = "a1b2c3d4e5";
		String[] ar = inputWord.split("");
		int sum = Arrays.stream(ar).filter(c -> Character.isDigit(c.charAt(0))).mapToInt(Integer::parseInt).sum();
//				.mapToInt(value -> Integer.parseInt(value)).sum();
		System.out.println(sum);

//	You are given a sentence. From the sentence, extract all words that start with the letter 'A' (any case), 
//  convert them to lowercase, then reverse them. Finally, reduce all the reversed words into a single string,
//  separated by hyphens.
//		Input: String sentence = "Amazing Algorithms Are Always Appreciated";
//		Output: Reversed words: gnizama-smhtirogla-era-syawlA-detaicerppA
		String sentence1 = "Amazing Algorithms Are Always Appreciated";
		String[] senArray = sentence1.split(" ");
		String reverseWord = Arrays.stream(senArray).filter(w -> w.toLowerCase().startsWith("a"))
				.map(s -> s.toLowerCase()).map(w -> new StringBuilder(w).reverse().toString())
				.collect(Collectors.joining("-"));
		System.out.println("Reversed words: " + reverseWord);
//	You are given a list of integers. From this list, filter out all even numbers that are greater than 5, 
//  and then multiply all of them together and print the result
//		Input: List<Integer> numbers = List.of(2, 3, 6, 8, 10, 1, 4);
//		Output:
//		Qualifying numbers: 6, 8, 10
//		Product of qualifying numbers: 480	
		List<Integer> digits = List.of(2, 3, 6, 8, 10, 1, 4);
		List<Integer> filtered = digits.stream().filter(n -> n % 2 == 0 && n > 5).toList();
		System.out.println("Qualifying numbers: " + filtered);
//		BinaryOperator<Integer> bo = new BinaryOperator<Integer>() {
//
//			@Override
//			public Integer apply(Integer t, Integer u) {
//				// TODO Auto-generated method stub
//				return t * u;
//			}
//		};
		int product = filtered.stream().reduce(1, (t, u) -> t * u);
		System.out.println("Product of qualifying numbers:" + product);

	}
}

package com.exercise.StringEx;

public class LongestWord {

	public static void main(String[] args) {
		String value = "Java is very powerful language";
		String[] words = value.split(" ");
		String longestWord = words[0];
		String smalestWord = words[0];
		for (String word : words) {
			if (word.length() > longestWord.length()) {
				longestWord = word;
			}
			if (word.length() < smalestWord.length()) {
				smalestWord = word;
			}
		}
		System.out.println("longest word : " + longestWord);
		System.out.println("smallest word : " + smalestWord);

	}

}

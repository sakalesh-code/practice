package com.exercise.StringEx;

public class CountVowels {
	public static void main(String[] args) {
		String value = "interview";
		int vowels = 0;
		int consonants = 0;
		for (int i = 0; i < value.length(); i++) {
			char ch = value.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowels++;
				} else {
					consonants++;
				}
			}
		}
		System.out.println("vowels : " + vowels);
		System.out.println("consonants : " + consonants);
		String vowelSet = "aeiou";
		vowels = 0;
		consonants = 0;
		for (int i = 0; i < value.length(); i++) {
			char s = value.charAt(i);
			if (Character.isLetter(s)) {
				if (vowelSet.indexOf(s) != -1) {
					vowels++;
				} else {
					consonants++;
				}
			}
		}
		System.out.println("vowels : " + vowels);
		System.out.println("consonants : " + consonants);

	}
}

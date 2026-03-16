package com.exercise.StringEx;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String value = "banana";
		boolean[] seen = new boolean[26];
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < value.length(); i++) {
			char ch = value.charAt(i);
			int index = ch - 'a';
			if (!seen[index]) { // first time
				seen[index] = true;
				result.append(ch);
			}

		}
		System.out.println(result);
	}
}

package com.exercise.StringEx;

public class Palindrome {
	public static void main(String[] args) {
		String value = "madam";
//		Palindrome p = new Palindrome();
//		p.isPalindrome(value);
		if (isPalindrome(value)) {
			System.out.println("It's a Palindrome");
		} else {
			System.out.println("It's not a Palindrome");
		}
		System.out.println();

	}

	static boolean isPalindrome(String value) {
		int left = 0;
		int right = value.length() - 1;
		while (left < right) {
			if (value.charAt(left) != value.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
}

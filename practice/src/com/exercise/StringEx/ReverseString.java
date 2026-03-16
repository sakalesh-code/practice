package com.exercise.StringEx;

public class ReverseString {
	public static void main(String[] args) {
		String value = "java";
		System.out.println("Before Reverse : " + value);

		// case 1
		StringBuffer sb = new StringBuffer(value);
		sb.reverse();
		System.out.println("Using StringBuffer : " + sb);

		// case 2
		StringBuilder sbu = new StringBuilder(value);
		sbu.reverse();
		System.out.println("Using StringBuilder : " + sbu);

		// case 3
		String reversed = "";
		for (int i = value.length() - 1; i >= 0; i--) {
			reversed = reversed + value.charAt(i);
		}
		System.out.println("Reversed String : " + reversed);

		// case 4 Reverse String WITHOUT StringBuilder / reverse()
		String input = "Java";
		char[] chars = input.toCharArray();
		int left = 0;
		int right = chars.length - 1;
		while (left < right) {
			char temp = chars[left];
			chars[left] = chars[right];
			chars[right] = temp;
			
			left++;
			right--;
		}
		System.out.println("Reverse String WITHOUT StringBuilder / reverse() : " + new String(chars));

	}
}

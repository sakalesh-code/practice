package com.collection.Framework.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {
		// Write program to store: 1 → Apple 2 → Banana 3 → Mango Then print: All k & v
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Apple");
		map.put(2, "Banana");
		map.put(3, "Mango");
		// System.out.println(map.get(1));
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}

		// Count Frequency of Elements Input : [1,1,2,3,3,3,4]
		int[] arr = { 1, 1, 2, 3, 3, 3, 4 };
		Map<Integer, Integer> m = new HashMap<>();
		for (int num : arr) {
			if (m.containsKey(num)) {
				m.put(num, m.get(num) + 1);
			} else {
				m.put(num, 1);
			}
		}
		System.out.println(m);

		// Find First Non-Repeated Character "aabbcdde"
		String str = "aabbcdde";
		Map<Character, Integer> countMap = new HashMap<>();
		for (char ch : str.toCharArray()) {
			countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
		}
		System.out.println(countMap);
		for (char ch : str.toCharArray()) {
			if (countMap.get(ch) == 1) {
				System.out.println("First Non-Repeated Character : " + ch);
				break;
			}
		}

	}
}

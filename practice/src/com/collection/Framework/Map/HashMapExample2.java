package com.collection.Framework.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {
	public static void main(String[] args) {
		// Find Duplicate Elements (Interview Question) {1,2,3,4,2,3,5}
		int[] arr = { 1, 2, 3, 4, 2, 3, 5 };
		Map<Integer, Integer> map = new HashMap<>();
		for (int num : arr) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println("duplicate : " + entry.getKey());
			}
		}
		// Most Frequent Element {1,3,3,2,1,3}
		int[] array = { 1, 3, 3, 2, 1, 3 };
		Map<Integer, Integer> m = new HashMap<>();
		for (int num : array) {
			m.put(num, m.getOrDefault(num, 0) + 1);
		}
		int max = 0;
		int element = 0;
		for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
			if (entry.getValue() > max) {
				max = entry.getValue();
				element = entry.getKey();
			}
		}
		System.out.println("Most Frequent Element : " + element);

		// Two Sum nums = [2,7,11,15] target = 9

		int ar[] = { 2, 7, 11, 15 };
		int target = 9;
		Map<Integer, Integer> map1 = new HashMap<>();
		for (int i = 0; i < ar.length; i++) {
			int compliment = target - ar[i];
			if (map1.containsKey(compliment)) {
				System.out.println("Two sum nums are : " + map1.get(compliment) + " , " + i);
			}
			map1.put(ar[i], i);
		}

	}
}

package com.collection.Framework.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {

		// HashMap – Doesn't guaranty Insertion Order
		Map<Integer, String> hMap = new HashMap<>();
		hMap.put(3, "C");
		hMap.put(1, "A");
		hMap.put(2, "B");
		System.out.println("HashMap : " + hMap);

		// Sort Map By Key (TreeMap)
		Map<Integer, String> tMap = new TreeMap<>();
		tMap.put(3, "C");
		tMap.put(1, "A");
		tMap.put(2, "B");

		System.out.println("TreeMap : " + tMap);

		// LinkedHashMap – Maintain Insertion Order
		Map<Integer, String> lMap = new LinkedHashMap<>();
		lMap.put(3, "C");
		lMap.put(1, "A");
		lMap.put(2, "B");
		System.out.println("LinkedHashMap : " + lMap);

	}
}

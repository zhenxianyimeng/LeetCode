package com.leetcode.ref.test;

import java.util.HashMap;
import java.util.Map;

public class testmap {
	public static void main(String[] args) {
		Map<Integer, String> map =  new HashMap<>();
		map.put(1, "1");
		map.put(2, "2");
		map.get(1);
		System.out.println(map.containsKey(1));
	}
}

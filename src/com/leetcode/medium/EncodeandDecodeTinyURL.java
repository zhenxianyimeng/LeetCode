package com.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class EncodeandDecodeTinyURL {
	
	private static List<String> list = new ArrayList<>();
	
	public static void main(String[] args) {
		String shortUrl;
		System.out.println(shortUrl = encode("https://leetcode.com/problems/design-tinyurl"));
		System.out.println(decode(shortUrl));
	}
	
	public static String encode(String longUrl){
		list.add(longUrl);
		return String.valueOf(list.size()-1);
	}
	
	public static String decode(String shortUrl){
		return list.get(Integer.parseInt(shortUrl));
	}
}

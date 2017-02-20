package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
	public static void main(String[] args) {
		List<String> list = fizzBuzz(15);
		for(String str : list)
			System.out.println(str);
	}
	public static List<String> fizzBuzz(int n) {
		List<String> list = new ArrayList<>();
		for(int i=1; i<=n; i++){
			if(i%3==0 && i%5==0)
				list.add("FizzBuzz");
			else if(i%3==0)
				list.add("Fizz");
			else if(i%5==0)
				list.add("Buzz");
			else 
				list.add(new String(i+""));
				
		}
		return list;
	}
}

package com.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {
	public static void main(String[] args) {
		int[] candies = {1,1,2,3};
		System.out.println(distributeCandies(candies));
	}
	 public static int distributeCandies(int[] candies) {
		 if(candies == null || candies.length == 0)
			 return 0;
		 Set<Integer> set = new HashSet<>();
		 for(int c : candies)
			 set.add(c);
		 return set.size() > candies.length/2 ? candies.length/2 : set.size();
	 }
}

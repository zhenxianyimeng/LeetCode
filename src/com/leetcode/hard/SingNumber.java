package com.leetcode.hard;

import java.util.HashSet;
import java.util.Set;

public class SingNumber {
	public static void main(String[] args) {
		int[] nums = {1,2,2,3,1};
		System.out.println(singleNumber(nums));
	}

	public static int singleNumber(int[] nums) {
		Set<Integer> set = new HashSet<>();
		for(int temp : nums){
			if(set.contains(temp))
				set.remove(temp);
			else
				set.add(temp);
		}
		return set.iterator().next();
	}
}

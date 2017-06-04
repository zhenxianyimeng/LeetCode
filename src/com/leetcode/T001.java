package com.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class T001 {
	
	public static void main(String[] args) {
		int[] nums = {2,7,11,15};
		int[] result = twoSum(nums, 9);
		for(int i=0; i<result.length; i++)
			System.out.println(result[i]);
	}
	
	public static int[] twoSum(int[] nums, int target) {
        
		 HashMap<Integer, Integer> map = new HashMap<>();
		    for (int i = 0; i < nums.length; i++) {
		        if (!map.containsKey(nums[i])) map.put(target - nums[i], i);
		        else return new int[] {map.get(nums[i]), i};
		    }
		    return null;
    }
}

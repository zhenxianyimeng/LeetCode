package com.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

//Find All Numbers Disappeared in an Array
public class FindAllNumbers {
	public static void main(String[] args) {
		int[] nums = {4,3,2,7,8,2,3,1};
		System.out.println(findDisappearedNumbers(nums));
	}

	public static List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> list = new ArrayList<>();
		for(int j=0; j<nums.length; j++){
			int i = Math.abs(nums[j])-1;
			if(nums[i] > 0)
				nums[i] = -nums[i];
		}
		for(int i=0; i<nums.length; i++)
			if(nums[i]>0)
				list.add(i+1);
		return list;
	}

}

package com.leetcode.easy;

public class MaxConsecutiveOnes {
	public static void main(String[] args) {
		int[] nums = {1,1,0,1,1,1};
		System.out.println(findMaxConsecutiveOnes(nums));
	}

	public static int findMaxConsecutiveOnes(int[] nums) {
		int max = 0;
		int temp = 0;
		for(int i=0; i<nums.length; i++){
			if(nums[i] == 1){
				temp++;
			}else if(nums[i] == 0){
				if(temp > max)
					max = temp;
				temp = 0;
			}
		}
		if(temp >max )
			max = temp;
		return max;
	}
}

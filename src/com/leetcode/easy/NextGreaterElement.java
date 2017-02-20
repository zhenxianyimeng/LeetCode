package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class NextGreaterElement {
	public static void main(String[] args) {
		int[] findNums = {2,4};
		int[] nums = {1,2,3,4};
		int[] outs = nextGreaterElement(findNums, nums);
		for(int i=0; i<outs.length; i++)
			System.out.println(outs[i]);
	}
    public static int[] nextGreaterElement(int[] findNums, int[] nums) {
        int[] outs = new int[findNums.length];
        for(int i=0; i<findNums.length; i++)
        	outs[i] = -1;
    	Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
        	map.put(nums[i], i);
        }
    	for(int i=0; i<findNums.length; i++){
        	int index = map.get(findNums[i]);
        	for(int j=index+1; j<nums.length; j++){
        		if(nums[j] > findNums[i]){
        			outs[i] = nums[j];
        			break;
        		}
        	}
        }
        
    	return outs;
    }
}

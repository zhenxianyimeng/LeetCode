package com.leetcode.easy;

import java.util.Arrays;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-02-04
 * @time: 20:24
 */
public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        int k=0;
        for (int i = 1; i <nums.length ; i++) {
            if(nums[i] > nums[k]){
                nums[++ k] = nums[i];
            }
        }
        return k+1;
    }

    public static void main(String[] args) {
        int[] array = {1};
        System.out.println(new RemoveDuplicatesFromSortedArray().removeDuplicates(array));
        System.out.println(Arrays.toString(array));
    }
}

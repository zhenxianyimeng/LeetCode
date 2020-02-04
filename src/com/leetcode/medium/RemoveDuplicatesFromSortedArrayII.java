package com.leetcode.medium;

import java.util.Arrays;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-02-04
 * @time: 21:29
 */
public class RemoveDuplicatesFromSortedArrayII {

    public int removeDuplicates(int[] nums) {
        if(nums.length <= 0){
            return nums.length;
        }
        int k=1;
        for (int i = 2; i <nums.length ; i++) {
            if(nums[i] != nums[k] || nums[i] != nums[k-1]){
                k++;
                nums[k] = nums[i];

            }
        }
        return k+1;

    }

    public static void main(String[] args) {
        int[] arr = {0};
        System.out.println(new RemoveDuplicatesFromSortedArrayII().removeDuplicates(arr));
        System.out.println(Arrays.toString(arr));
    }
}

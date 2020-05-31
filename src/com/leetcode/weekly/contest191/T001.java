package com.leetcode.weekly.contest191;

import java.util.Arrays;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-05-31
 * @time: 10:59
 */
public class T001 {

    public static void main(String[] args) {
        int[] arr = {3,4,5,2};
        System.out.println(new T001().maxProduct(arr));
    }

    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length - 1;
        return (nums[length] - 1) * (nums[length - 1] -1);
    }
}

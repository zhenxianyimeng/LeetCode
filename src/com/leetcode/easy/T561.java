package com.leetcode.easy;

import java.util.Arrays;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2021-02-17
 * @time: 00:24
 */
public class T561 {

    public static void main(String[] args) {
        int[] nums = {6,2,6,5,1,2};
        System.out.println(new T561().arrayPairSum(nums));
    }

    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i%2 == 0){
                sum += nums[i];
            }
        }
        return sum;
    }
}

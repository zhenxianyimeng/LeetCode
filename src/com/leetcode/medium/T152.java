package com.leetcode.medium;

import sun.nio.cs.ext.MacArabic;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-05-18
 * @time: 19:32
 */
public class T152 {
    public static void main(String[] args) {
        int[] arr = {2,3,-2,4};
        System.out.println(new T152().maxProduct(arr));
    }

    public int maxProduct(int[] nums) {
        int tmax = 1;
        int tmin = 1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i] < 0){
                int temp = tmax;
                tmax = tmin;
                tmin = temp;
            }
            tmax = Math.max(tmax*nums[i], nums[i]);
            tmin = Math.min(tmin*nums[i], nums[i]);
            max = Math.max(max, tmax);
        }
        return max;

    }
}

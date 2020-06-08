package com.leetcode.weekly.contest192;

import java.util.Arrays;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-06-07
 * @time: 10:35
 */
public class T001 {

    public static void main(String[] args) {
        int[] arr = {2,5,1,3,4,7};
        System.out.println(Arrays.toString(new T001().shuffle(arr, 3)));
    }

    public int[] shuffle(int[] nums, int n) {
        int[] re = new int[nums.length];
        for (int i = 0; i < n ; i++) {
            re[i * 2] = nums[i];
            re[i*2 + 1] = nums[i+n];
        }
        return re;
    }

}

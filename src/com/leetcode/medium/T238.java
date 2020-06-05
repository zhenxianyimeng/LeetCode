package com.leetcode.medium;

import java.util.Arrays;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-06-04
 * @time: 20:03
 */
public class T238 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(new T238().productExceptSelf(arr)));
    }

    public int[] productExceptSelf(int[] nums) {
        int[] re = new int[nums.length];
        re[0] = 1;
        for (int i = 1; i <nums.length ; i++) {
            re[i] = re[i-1] * nums[i-1];
        }
        int temp = 1;
        for (int i = nums.length - 2; i >=0 ; i--) {
            temp = temp * nums[i + 1];
            re[i] = re[i] * temp;
        }
        return re;
    }
}

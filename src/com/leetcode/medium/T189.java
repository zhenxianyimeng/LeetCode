package com.leetcode.medium;

import java.util.Arrays;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2021-01-08
 * @time: 22:31
 */
public class T189 {

    public static void main(String[] args) {
        int[] arr = {-1,-100,3,99};
        int k =2;
        new T189().rotate(arr, k);
        System.out.println(Arrays.toString(arr));

    }

    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k % len;
        for (int i = 0; i <len/2 ; i++) {
            int temp = nums[i];
            nums[i] = nums[len-1 -i];
            nums[len-1 - i] = temp;
        }
        for (int i = 0; i <k/2 ; i++) {
            int temp = nums[i];
            nums[i] = nums[k-1 -i];
            nums[k-1 - i] = temp;
        }
        for (int i = k; i <(len +k)/2 ; i++) {
            int temp = nums[i];
            nums[i] = nums[len-1 -(i-k)];
            nums[len-1 -(i-k)] = temp;
        }
    }
}

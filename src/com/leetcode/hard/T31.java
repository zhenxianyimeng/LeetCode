package com.leetcode.hard;

import java.util.Arrays;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2021-06-14
 * @time: 13:59
 */
public class T31 {
    public static void main(String[] args) {
//        int[] arr = {3,2,1};
//        int[] arr = {1,5,1};
//        int[] arr = {1,2,3,8,5,7,6,4};
        int[] arr = {1,2,3};
        new T31().nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }

    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }
        int i;
        for (i = nums.length - 1; i >= 1; i--) {
            if (nums[i] > nums[i - 1]) {
                break;
            }
        }
        int j;
        if (i > 0) {
            for (j = i; j < nums.length; j++) {
                if (nums[j] <= nums[i - 1]) {
                    break;
                }
            }
            swap(nums, i - 1, j - 1);
        }

        int before = i;
        int after = nums.length - 1;
        while (before < after) {
            swap(nums, before, after);
            before++;
            after--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}

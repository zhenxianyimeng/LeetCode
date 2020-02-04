package com.leetcode.medium;

import java.util.Arrays;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-02-04
 * @time: 22:45
 */
public class SortColors {
    public void sortColors(int[] nums) {
        int[] arr = new int[3];
        for (int n : nums){
            arr[n]++;
        }
        int index = 0;
        for (int j=0; j<arr.length; j++){
            for (int i = 0; i <arr[j] ; i++) {
                nums[index] = j;
                index++;
            }
        }
    }

    public void sortColors2(int[] nums) {

    }

    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        new SortColors().sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }
}

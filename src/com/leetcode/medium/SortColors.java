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
        int zero = -1;
        int two = nums.length;
        int i=0;
        while (i<two){
            if(nums[i] == 1){
                i++;
            }else if(nums[i] == 0){
                zero++;
                swap(nums, zero, i);
                i++;
            }else if(nums[i] == 2){
                two--;
                swap(nums,two, i);
            }
        }
    }

    public void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,0};
        new SortColors().sortColors2(arr);
        System.out.println(Arrays.toString(arr));
    }
}

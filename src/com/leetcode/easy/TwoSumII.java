package com.leetcode.easy;

import java.util.Arrays;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-02-06
 * @time: 23:39
 */
public class TwoSumII {

    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length -1;
        while (l < r){
            if(numbers[l] + numbers[r] == target){
                return new int[]{l+1, r+1};
            }else if(numbers[l] + numbers[r] < target){
                l++;
            }else {
                r--;
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        System.out.println(Arrays.toString(new TwoSumII().twoSum(arr, 9)));
    }
}

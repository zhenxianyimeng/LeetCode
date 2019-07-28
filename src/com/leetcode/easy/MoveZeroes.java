package com.leetcode.easy;

import java.util.Arrays;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2019-07-28
 * @time: 00:41
 */
public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        new MoveZeroes().moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }

    public void moveZeroes(int[] nums) {
        if(nums == null || nums.length<=1){
            return;
        }
        int insertPos = 0;
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]!=0){
                nums[insertPos++] = nums[i];
            }
        }
        while (insertPos < nums.length){
            nums[insertPos++]=0;
        }
    }
}

package com.leetcode.easy;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2021-01-24
 * @time: 23:40
 */
public class T674 {
    public static void main(String[] args) {
        int[] nums = {1,3,5,7};
        System.out.println(new T674().findLengthOfLCIS(nums));
    }

    public int findLengthOfLCIS(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int i=0;
        int j=1;
        int max = 0;
        while (j < nums.length){
            if(nums[j-1] < nums[j]){
                j++;
            }else {
                int tmp = j-i;
                if(tmp > max){
                    max = tmp;
                }
                i=j;
                j=j+1;
            }
        }
        int tmp = j-i;
        if(tmp > max){
            max = tmp;
        }
        return max;
    }
}

package com.leetcode.medium;

import java.util.Arrays;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-05-07
 * @time: 13:58
 */
public class _3SumClosest {

    public static void main(String[] args) {
        int[] arr = {-1, 2, 1, -4};
        System.out.println(new _3SumClosest().threeSumClosest(arr, 1));
    }

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int len = nums.length;
        int minDiff = Integer.MAX_VALUE;
        int result = 0;
        for (int i = 0; i <len - 2 ; i++) {
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int left = i + 1;
            int rigth = len - 1;
            while (left < rigth){
                int sum = nums[i] + nums[left] + nums[rigth];
                if(sum == target){
                    return target;
                }
//                System.out.println("temp:" + sum);
                if(sum < target){
                    while (left < rigth && nums[left+1] == nums[left]){
                        left ++;
                    }
                    left ++;
                }else if(sum > target){
                    while (left < rigth && nums[rigth-1] == nums[rigth]){
                        rigth --;
                    }
                    rigth--;
                }
                int diff = Math.abs(target - sum);
                if(diff < minDiff){
                    minDiff = diff;
                    result = sum;
                }
            }
        }
        return result;
    }


}

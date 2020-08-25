package com.leetcode.medium;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-08-25
 * @time: 19:25
 */
public class T123 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        System.out.println(new T123().rob(arr));
    }

    public int rob(int[] nums) {
        return Math.max(tmpRob(nums, 0, nums.length-1), tmpRob(nums, 1, nums.length));
    }

    public int tmpRob(int[] nums, int from, int to) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }
        int[] dp = new int[nums.length];
        if(from == 0){
            dp[0] = nums[0];
            dp[1] = Math.max(nums[0], nums[1]);
        }else if(from == 1){
            dp[0] = 0;
            dp[1] = nums[1];
        }
        for (int i = 2; i <to; i++) {
            dp[i] = Math.max(dp[i-1], dp[i-2] + nums[i]);
        }
        return dp[to-1];
    }
}

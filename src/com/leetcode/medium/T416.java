package com.leetcode.medium;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-08-28
 * @time: 19:01
 */
public class T416 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        System.out.println(new T416().canPartition(arr));
    }

    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i = 0; i <nums.length ; i++) {
            sum = sum + nums[i];
        }
        if(sum % 2 == 1){
            return false;
        }
        int total = sum/2;
        boolean[][] dp = new boolean[nums.length+1][total+1];
        for (int i=0; i<=nums.length; i++){
            dp[i][0] = true;
        }
        for (int i = 1; i <=nums.length ; i++) {
            for (int j = 1; j <=total ; j++) {
                if(j - nums[i-1] < 0){
                    dp[i][j] = dp[i-1][j];
                }else {
                    dp[i][j] = dp[i-1][j] || dp[i-1][j-nums[i-1]];
                }
            }
        }

        return dp[nums.length][total];
    }
}

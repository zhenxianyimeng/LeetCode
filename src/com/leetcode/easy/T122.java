package com.leetcode.easy;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-07-30
 * @time: 20:07
 */
public class T122 {

    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n+1][2];
        for (int i = 0; i <n+1 ; i++) {
            if(i == 0){
                dp[0][0] = 0;
                dp[0][1] = Integer.MIN_VALUE;
                continue;
            }
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1] + prices[i-1]);
            dp[i][1] = Math.max(dp[i-1][1], dp[i-1][0] - prices[i-1]);
        }
        return dp[n][0];
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(new T122().maxProfit(prices));
    }
}

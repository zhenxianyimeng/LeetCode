package com.leetcode.medium;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-07-10
 * @time: 16:02
 */
public class T322 {

    public static void main(String[] args) {
        int[] coins = new int[]{2};
        System.out.println(new T322().coinChange(coins, 3));
    }

    public int coinChange(int[] coins, int amount) {
        int[] arr = new int[amount + 1];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = amount + 1;
        }
        arr[0] = 0;
        for (int i = 0; i <arr.length ; i++) {
            int min = amount + 1;
            for(int coin : coins){
                if(i-coin < 0){
                    continue;
                }
                if(arr[i - coin] < min){
                    min = arr[i - coin];
                }
            }
            if(min < amount + 1){
                arr[i] = min + 1;
            }
        }
        return arr[amount] == amount+1? -1 :arr[amount];
    }
}

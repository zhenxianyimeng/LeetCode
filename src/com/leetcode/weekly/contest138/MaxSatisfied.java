package com.leetcode.weekly.contest138;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2019-05-26
 * @time: 10:47
 */
public class MaxSatisfied {
    public static void main(String[] args) {
        int[] customers = {1,0,1,2,1,1,7,5};
        int[] grumpy = {0,1,0,1,0,1,0,1};
        int X = 3;
//        int[] customers = {4, 10, 10};
//        int[] grumpy = {1,1,0};
//        int X = 2;
        MaxSatisfied maxSatisfied = new MaxSatisfied();
        int sum = maxSatisfied.maxSatisfied(customers, grumpy, X);
        System.out.println(sum);
    }

    public int maxSatisfied(int[] customers, int[] grumpy, int X) {
        int cN = customers.length;
        int maxSum = 0;
        for (int i = 0; i <=cN-X ; i++) {
            int temp = 0;
            for (int j=0; j<i; j++){
                if(grumpy[j] == 0){
                    temp += customers[j];
                }
            }
            for (int j=i; j<i+X; j++){
                temp += customers[j];
            }
            for (int j=i+X; j<cN; j++){
                if(grumpy[j] == 0){
                    temp += customers[j];
                }
            }
            if(temp > maxSum){
                maxSum = temp;
            }
        }

        return maxSum;
    }
}

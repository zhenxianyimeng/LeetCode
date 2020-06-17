package com.leetcode.medium;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-06-17
 * @time: 19:34
 */
public class T1014 {

    public static void main(String[] args) {
        int[] arr = {8,1,5,2,6};
        System.out.println(new T1014().maxScoreSightseeingPair(arr));
    }

    public int maxScoreSightseeingPair(int[] A) {
        int max = 0;
        int maxTemp = A[0] + 0;
        for (int i = 1; i <A.length ; i++) {
            max = Math.max(max, maxTemp + A[i] - i);
            maxTemp = Math.max(maxTemp, A[i]+i);
        }
        return max;
    }
}

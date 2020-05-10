package com.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-05-08
 * @time: 19:18
 */
public class _4SumII {

    public static void main(String[] args) {
        int[] A = {1, 2};
        int[] B = {-2,-1};
        int[] C = {-1, 2};
        int[] D = {0, 2};
        System.out.println(new _4SumII().fourSumCount(A, B, C, D));
    }

    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> map = new HashMap<>();
        int num = 0;
        for (int i = 0; i <A.length ; i++) {
            for (int j = 0; j <B.length ; j++) {
                int sum = A[i] + B[j];
                Integer value = map.get(sum);
                if (value == null) {
                    map.put(sum, 1);
                } else {
                    map.put(sum, value + 1);
                }
            }
        }
        for (int i = 0; i <C.length ; i++) {
            for (int j = 0; j <D.length ; j++) {
                Integer value = map.get(-C[i] - D[j]);
                if(value != null){
                    num += value;
                }
            }
        }
        return num;
    }

}

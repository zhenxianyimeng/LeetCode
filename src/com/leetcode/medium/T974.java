package com.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-05-27
 * @time: 19:45
 */
public class T974 {
    public static void main(String[] args) {
//        System.out.println(-4%3);
        int[] arr = {4,5,0,-2,-3,1};
        System.out.println(new T974().subarraysDivByK(arr, 5));
    }

    public int subarraysDivByK(int[] A, int K) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int count = 0;
        int preSum = 0;
        for (int i = 0; i <A.length ; i++) {
            preSum = preSum + A[i];
            int m = preSum % K;
            if(m < 0){
                m = (m + K) % K;
            }
            Integer value = map.get(m);
            if(value == null){
                map.put(m, 1);
            }else {
                count += value;
                map.put(m, value+1);
            }
        }
        return count;
    }

}

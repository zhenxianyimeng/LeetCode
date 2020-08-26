package com.leetcode.easy;

import com.leetcode.medium.T152;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-08-25
 * @time: 19:55
 */
public class T1512 {

    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n : nums){
            Integer v = map.getOrDefault(n, 0);
            map.put(n, v+1);
        }
        int sum = 0;
        for (int v : map.values()){
            for (int i = v-1; i >=0 ; i--) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,1};
        System.out.println(new T1512().numIdenticalPairs(arr));
    }
}

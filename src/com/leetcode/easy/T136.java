package com.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-05-14
 * @time: 14:57
 */
public class T136 {

    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        System.out.println(new T136().singleNumber(arr));
    }

    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums){
            if(!set.remove(n)){
                set.add(n);
            }
        }
        for (int n : set){
            return n;
        }
        return 0;
    }
}

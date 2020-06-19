package com.leetcode.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-06-19
 * @time: 17:01
 */
public class T217 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        System.out.println(new T217().containsDuplicate(arr));
    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }

}

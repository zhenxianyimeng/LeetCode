package com.leetcode.easy;

import java.util.*;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-03-26
 * @time: 13:39
 */
public class IntersectionofTwoArrays {
    public static void main(String[] args) {
        int[] num1 = {4,9,5};
        int[] num2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(new IntersectionofTwoArrays().intersection(num1, num2)));
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for(int t : nums1){
            set.add(t);
        }
        Set<Integer> set2 = new HashSet<>();
        for(int t : nums2){
            if(set.contains(t)){
                set2.add(t);
            }
        }
        int[] r = new int[set2.size()];
        int index = 0;
        for (int t : set2){
            r[index++] = t;
        }
        return r;
    }
}

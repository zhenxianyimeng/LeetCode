package com.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author zjb
 * @date 2018/12/24.
 */
public class NRepeatedElementinSize2NArray {

    public static void main(String[] args) {
        int[] arr = {5,1,5,2,5,3,5,4};
        System.out.println(repeatedNTimes(arr));
    }

    public static int repeatedNTimes(int[] A) {
        Set<Integer> set = new HashSet<>();
        for(int t : A){
            if(set.contains(t)) {
                return t;
            }
            set.add(t);
        }
        return 0;
    }
}

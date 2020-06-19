package com.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-06-19
 * @time: 17:32
 */
public class T219 {

    public static void main(String[] args) {
        int[] arr = {1,0,1,1};
        int k = 1;
        System.out.println(new T219().containsNearbyDuplicate(arr, k));
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        int t = 0;
        for (int i = 0; i <nums.length ; i++) {
            if(set.size() > k){
                set.remove(nums[t]);
                t++;
            }
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}

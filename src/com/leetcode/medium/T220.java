package com.leetcode.medium;

import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-06-19
 * @time: 17:41
 */
public class T220 {

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        int before = 0;
        TreeMap<Long, Integer> map = new TreeMap<>();
        int size = 0;
        for (int i = 0; i <nums.length ; i++) {
            if(size > k){
                int value = map.get((long)nums[before]);
                if(value == 1){
                    map.remove((long)nums[before]);
                }else {
                    map.put((long)nums[before], value -1);
                }
                before++;
                size--;
            }
            Long floor = map.floorKey((long)nums[i] + t);
            if (floor != null && floor >= (long)nums[i] - t){
                return true;
            }
            Integer value = map.get((long)nums[i]);
            if(value == null){
                map.put((long)nums[i], 1);
            }else {
                map.put((long)nums[i], value + 1);
            }
            size++;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {-2147483648,-2147483647};
        int k = 3;
        int t = 3;
        System.out.println(new T220().containsNearbyAlmostDuplicate(arr, k, t));
    }
}

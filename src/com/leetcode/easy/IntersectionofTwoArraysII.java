package com.leetcode.easy;

import java.util.*;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-03-26
 * @time: 13:49
 */
public class IntersectionofTwoArraysII {

    public static void main(String[] args) {
        int[] num1 = {1,2,2,1};
        int[] num2 = {2,2};
        System.out.println(Arrays.toString(new IntersectionofTwoArraysII().intersect(num1, num2)));
    }


    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> countMap = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(Integer num : nums1){
            if(countMap.containsKey(num)){
                countMap.put(num, countMap.get(num)+1);
            }else {
                countMap.put(num, 1);
            }
        }
        for(Integer num : nums2){
            Integer count = countMap.get(num);
            if(count != null){
                if(count == 1){
                    countMap.remove(num);
                }else {
                    countMap.put(num,count-1);
                }
                list.add(num);
            }
        }
        return list.stream().mapToInt(n->n).toArray();
    }
}

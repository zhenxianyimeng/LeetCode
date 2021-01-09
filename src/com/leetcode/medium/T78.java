package com.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2021-01-09
 * @time: 01:00
 *  1,2,3
 */
public class T78 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> subsets = new T78().subsets(arr);
        for (List<Integer> list : subsets){
            for(Integer integer : list){
                System.out.print(integer);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int total = 1 << nums.length;
        for (int i = 0; i <total ; i++) {
            int t;
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j <nums.length ; j++) {
                t = 1 << j;
                if ((i & t) != 0){
                    list.add(nums[j]);
                }
            }
            result.add(list);
        }
        return result;
    }
}
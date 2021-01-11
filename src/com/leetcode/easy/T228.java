package com.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2021-01-10
 * @time: 22:05
 */
public class T228 {

    public static void main(String[] args) {
        int[] arr = {0,1,2,4,5,7};
        List<String> list = new T228().summaryRanges(arr);
        System.out.println(Arrays.toString(list.toArray()));
    }

    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        if(nums == null || nums.length == 0){
            return list;
        }
        if(nums.length == 1){
            list.add(String.valueOf(nums[0]));
            return list;
        }

        int left = 0;
        int right = 1;
        while (right < nums.length){
            if(nums[right] - nums[right - 1] == 1){
                right ++ ;
            }else {
                if(nums[right - 1] ==  nums[left]){
                    list.add(String.valueOf(nums[left]));
                }else {
                    list.add(nums[left] + "->" + nums[right - 1]);
                }
                left = right;
                right = left + 1;
            }

        }
        if(nums[right - 1] ==  nums[left]){
            list.add(String.valueOf(nums[left]));
        }else {
            list.add(nums[left] + "->" + nums[right - 1]);
        }

        return list;
    }
}

package com.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-05-07
 * @time: 10:41
 */
public class _4Sum {

    public static void main(String[] args) {
        int[] arr = {1, 0, -1, 0, -2, 2};
        List<List<Integer>> lists = new _4Sum().fourSum(arr, 0);
        for (List<Integer> list : lists){
            System.out.println(Arrays.toString(list.toArray()));
        }
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> lists = new ArrayList<>();
        if(nums == null || nums.length <4){
            return lists;
        }
        Arrays.sort(nums);
        int len = nums.length;
        for (int i = 0; i <len - 3 ; i++) {
            if(nums[i] * 4 > target){
                return lists;
            }
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            for (int j = i+1; j <len - 2 ; j++) {
                if(j > i+1 && nums[j] == nums[j-1]){
                    continue;
                }
                int left = j + 1;
                int right = len - 1;
                while (left < right){
                    if(nums[right]*4 < target){
                        break;
                    }
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if(sum == target){
                        lists.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        while (left < right && nums[left]==nums[left+1]){
                            left ++;
                        }
                        while (right > left && nums[right] == nums[right -1]){
                            right --;
                        }
                        left++;
                        right--;
                    }else if(sum > target){
                        while (right > left && nums[right] == nums[right -1]){
                            right --;
                        }
                        right--;
                    }else {
                        while (left < right && nums[left] == nums[left+1]){
                            left ++;
                        }
                        left++;
                    }
                }

            }

        }
        return lists;
    }
}

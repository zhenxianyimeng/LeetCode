package com.leetcode.medium;

import java.util.Arrays;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-07-20
 * @time: 17:46
 */
public class T34 {

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        System.out.println(Arrays.toString(new T34().searchRange(nums, 6)));
//        System.out.println(new T34().getLeft(nums, 10));
//        System.out.println(new T34().getRight(nums, 10));
    }

    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        arr[0] = getLeft(nums, target);
        arr[1] = getRight(nums, target);
        return arr;
    }

    public int getLeft(int[] nums, int target){
        int left = 0;
        int right = nums.length;
        while (left < right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                right = mid;
            }else if(nums[mid] < target){
                left = mid + 1;
            }else {
                right = mid;
            }
        }
        if (left >= nums.length || nums[left] != target){
            return -1;
        }
        return left;
    }

    public int getRight(int[] nums, int target){
        int left = 0;
        int right = nums.length;
        while (left < right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                left = mid + 1;
            }else if(nums[mid] < target){
                left = mid + 1;
            }else {
                right = mid;
            }
        }
        if (right -1 < 0 || nums[right-1] != target){
            return -1;
        }
        return right  -1;
    }

}

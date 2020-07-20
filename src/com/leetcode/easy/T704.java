package com.leetcode.easy;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-07-20
 * @time: 17:04
 */
public class T704 {

    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        System.out.println(new T704().search(nums, 9));

    }

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                right = mid - 1;
            }else {
                left = mid+1;
            }
        }

        return -1;
    }
}

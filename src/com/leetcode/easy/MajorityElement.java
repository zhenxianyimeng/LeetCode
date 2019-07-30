package com.leetcode.easy;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2019-07-30
 * @time: 23:12
 */
public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2};
        System.out.println(new MajorityElement().majorityElement(arr));
    }

    public int majorityElement(int[] nums) {
        if(nums == null || nums.length==0)
            return -1;
        int count = 0;
        int major = 0;
        for (int i = 0; i <nums.length ; i++) {
            if(count == 0){
                major = nums[i];
                count++;
            }else if(major == nums[i]){
                count++;
            }else {
                count--;
            }
        }
        return major;
    }
}

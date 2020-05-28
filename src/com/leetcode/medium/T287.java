package com.leetcode.medium;

/**
 * Description:
 *  N+1个数，1-n之间，找重复
 * @author: chixiao
 * @date: 2020-05-26
 * @time: 19:48
 */
public class T287 {

    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        System.out.println(new T287().findDuplicate(arr));
    }

    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int l = 1;
        int r = n - 1;
        int mid = 0;
        int ans = -1;
        while (l <= r){
            mid = (l + r) >> 1;
            int count = 0;
            for (int i = 0; i <n ; i++) {
                if(nums[i] <= mid){
                    count ++;
                }
            }
            if(count <= mid){
                l = mid + 1;
            }else {
                r = mid - 1;
                ans = mid;
            }
        }
        return ans;
    }
}

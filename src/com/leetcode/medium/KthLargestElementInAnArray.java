package com.leetcode.medium;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-02-05
 * @time: 21:29
 */
public class KthLargestElementInAnArray {

    public int findKthLargest(int[] nums, int k) {
        return find(nums, 0, nums.length - 1, k);
    }

    public int find(int[] nums, int l, int r, int k) {
        int m = partition(nums, l, r);
        if (m+1 == k ) {
            return nums[m];
        } else if (m+1 < k) {
            return find(nums, m + 1, r, k);
        } else {
            return find(nums, l, m - 1, k);
        }
    }

    public int partition(int[] nums, int l, int r) {
//        if(l==r){
//            return l;
//        }
        int v = nums[l];
        int k = l;
        for (int i = l+1; i <=r ; i++) {
            if(nums[i] > v){
                swap(nums,k+1, i);
                k++;
            }
        }
        swap(nums, k, l);
        return k;
    }

    public void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {2,1};
        int k = 1;
        System.out.println(new KthLargestElementInAnArray().findKthLargest(arr, k));
    }
}

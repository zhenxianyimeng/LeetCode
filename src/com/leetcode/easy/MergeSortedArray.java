package com.leetcode.easy;

import java.util.Arrays;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-02-05
 * @time: 20:47
 */
public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m];
        for (int i = 0; i <m ; i++) {
            temp[i] = nums1[i];
        }
        int i=0;
        int j=0;
        int index = 0;
        while (i<m && j<n){
            if(temp[i] < nums2[j]){
                nums1[index] = temp[i++];
            }else {
                nums1[index] = nums2[j++];
            }
            index++;
        }
        while (i<m){
            nums1[index++] = temp[i++];
        }
        while (j<n){
            nums1[index++] = nums2[j++];
        }
    }


    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        new MergeSortedArray().merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }
}

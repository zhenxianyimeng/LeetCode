package com.leetcode.hard;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2021-02-17
 * @time: 00:36
 */
public class T4 {
    public static void main(String[] args) {
        int[] nums1 = {0,0};
        int[] nums2 = {0,0};
        double medianSortedArrays = new T4().findMedianSortedArrays(nums1, nums2);
        System.out.println(medianSortedArrays);
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int total = (nums1.length + nums2.length)/2 + 1;
        int tmpTotal = 0;
        int i=0;
        int j=0;
        int num = 0;
        int preNum =0;
        while (i<nums1.length && j<nums2.length){
            if(nums1[i] < nums2[j]){
                preNum = num;
                num = nums1[i];
                i++;
            }else {
                preNum = num;
                num = nums2[j];
                j++;
            }
            tmpTotal++;
            if(tmpTotal >= total){
                break;
            }
        }
        while (i<nums1.length && tmpTotal < total){
            preNum = num;
            num = nums1[i];
            i++;
            tmpTotal++;
            if(tmpTotal >= total){
                break;
            }
        }
        while (j<nums2.length && tmpTotal < total){
            preNum = num;
            num = nums2[j];
            j++;
            tmpTotal++;
            if(tmpTotal >= total){
                break;
            }
        }
        if((nums1.length + nums2.length) % 2 == 0){
            return (preNum + num)/2.0;
        }else {
            return num;
        }
    }
}

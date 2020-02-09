package com.twoweekly.contest19;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-02-08
 * @time: 22:38
 */
public class T5312 {

    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int t=0;
        for (int i = 0; i+k-1 < arr.length ; i++) {
            int sum = 0;
            for (int j = i; j < i+k; j++) {
                sum = sum + arr[j];
            }
            if(sum >= k * threshold){
                t++;
            }
        }
        return t;
    }

    public static void main(String[] args) {
        int[] arr = {2,2,2,2,5,5,5,8};
        int k = 3;
        int threshold = 4;
        System.out.println(new T5312().numOfSubarrays(arr, k, threshold));
    }
}

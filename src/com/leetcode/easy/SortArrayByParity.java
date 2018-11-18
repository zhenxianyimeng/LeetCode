package com.leetcode.easy;

import java.util.Arrays;

/**
 * @author zjb
 * @date 2018/11/11.
 */
public class SortArrayByParity {
    public static void main(String[] args) {
        int[] A = {3,1,2,4};
        int[] B = sortArrayByParity(A);
        System.out.println(Arrays.toString(B));
    }
    public static int[] sortArrayByParity(int[] A) {
        if(A == null ){
            return null;
        }
        int[] B = new int[A.length];
        int head = 0;
        int tail = A.length -1;
        for(int temp : A){
            if(temp%2 == 0){
                B[head++] = temp;
            }else {
                B[tail--] = temp;
            }
        }
        return B;
    }
}

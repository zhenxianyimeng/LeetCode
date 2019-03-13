package com.leetcode.easy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author zjb
 * @date 2019/3/11.
 */
public class SquaresofaSortedArray {
    public static void main(String[] args) {
        int[] arr = {-7};
        System.out.println(Arrays.toString(sortedSquares(arr)));
    }

    public static int[] sortedSquares(int[] A) {
        if(A==null || A.length <= 0){
            return A;
        }

        int[] arr = new int[A.length];
        int i = 0;
        int j = A.length -1;
        int pA = A.length - 1;
        while (pA >= 0){
            if(Math.abs(A[i]) < Math.abs(A[j])){
                arr[pA] = A[j] * A[j];
                j--;
            }else {
                arr[pA] = A[i] * A[i];
                i++;
            }
            pA--;
        }
        return arr;
    }

}

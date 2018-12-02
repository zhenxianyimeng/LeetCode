package com.leetcode.easy;

import java.util.Arrays;

/**
 * @author zjb
 * @date 2018/11/24.
 */
public class FlippingAnImage {

    public static void main(String[] args) {
        int[][] A = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] B = flipAndInvertImage(A);
        for(int[] temp : B){
            System.out.println(Arrays.toString(temp));
        }
    }

    public static int[][] flipAndInvertImage(int[][] A) {
        for(int[] temp : A){
            for(int i=0; i<temp.length/2; i++){
                int t = temp[i];
                temp[i] = temp[temp.length-1-i];
                temp[temp.length-1-i] = t;
            }
            for (int i = 0; i <temp.length ; i++) {
                temp[i] = temp[i] ^ 0x01;
            }
        }
        return A;
    }
}

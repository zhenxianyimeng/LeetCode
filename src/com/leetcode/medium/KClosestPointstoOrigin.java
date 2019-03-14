package com.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author zjb
 * @date 2019/3/14.
 */
public class KClosestPointstoOrigin {

    public static void main(String[] args) {
        int[][] points = {{3,2},{7,7},{9,-9},{4,-6},{-3,-6}};
        int [][] result = kClosest(points, 4);
        for(int[] a : result){
            System.out.println(Arrays.toString(a));
//            System.out.println();
        }
    }

    public static int[][] kClosest(int[][] points, int K) {
        int end = points.length - 1;
        int start = 0;
        while (start < end){
            int pos = partition(start, end, points);
            if(pos == K){
                break;
            }
            if(pos < K){
                start = pos +1;
            }else {
                end = pos -1;
            }

        }
        return Arrays.copyOfRange(points, 0, K);
    }

    private static int partition(int start, int end, int[][] points){
        int i=start+1;
        for(int k=start+1; k<=end; k++){
            if(compare(points[k], points[start]) > 0)    {
                continue;
            }else {
                swap(points, k, i);
                i++;
            }
        }
        swap(points, start, i-1);
        return i-1;
    }

    private static void swap(int[][] points, int from, int to){
        int[] temp = points[from];
        points[from] = points[to];
        points[to] = temp;
    }

    private static int compare(int[] a, int[] b){
        return a[0]*a[0] + a[1]*a[1] - b[0]*b[0] -b[1]*b[1];
    }
}

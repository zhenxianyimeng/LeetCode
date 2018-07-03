package com.leetcode.medium;

/**
 * @author zjb
 * @date 2018/5/31.
 */
public class MaxIncreasetoKeepCitySkyline {

    public static void main(String[] args) {
        int[][] grid = {
                {3,0,8,4},
                {2,4,5,7},
                {9,2,6,3},
                {0,3,1,0}
        };
        System.out.println(maxIncreaseKeepingSkyline(grid));
    }

    public static int maxIncreaseKeepingSkyline(int[][] grid) {
        int N = grid.length;
        int[] maxRow = new int[N];
        int[] maxCol = new int[N];
        for(int i=0; i<N; i++){
            maxRow[i] = findMax(grid[i]);
        }
        for(int j=0; j<N; j++){
            maxCol[j] = 0;
            for(int i=0; i<N; i++){
                if(maxCol[j] < grid[i][j]){
                    maxCol[j] = grid[i][j];
                }
            }
        }
        int total = 0;
        for (int i = 0; i <N ; i++) {
            for(int j=0; j<N; j++){
                total += (Math.min(maxRow[i], maxCol[j]) - grid[i][j]);
            }
        }

        return total;
    }

    private static int findMax(int[] arr){
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}

package com.leetcode.easy;

import java.util.Arrays;

public class ReshapeTheMatrix {
	
	public static void main(String[] args) {
		int[][] arr = {{1,2},{3,4}};
		arr = matrixReshape(arr, 2, 2);
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(Arrays.deepToString(arr));
		Arrays.asList().stream().forEach(c->System.out.println(c));
	}
	
	public static int[][] matrixReshape(int[][] nums, int r, int c) {
		int n = nums.length;
		int m = nums[0].length;
		if(n*m != r*c)
			return nums;
		int[][] arr = new int[r][c];
		for(int i=0; i<r*c; i++){
			arr[i/c][i%c] = nums[i/m][i%m];
		}
		
		return arr;
	}
}

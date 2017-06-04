package com.leetcode.medium;

public class T001 {
	public static void main(String[] args) {
		int arr[] = countBits(5);
		for(int i=0; i<arr.length; i++)
			System.out.println(arr[i]);
	}
	public static int[] countBits(int num) {
		int[] arr = new int[num+1];
		if(num==0)
			arr[0] = 0;
		else {
			arr[0] = 0;
			arr[1] = 1;
			int i = 2; 
			int p = 1;
			while(i <= num){
				int begin = (int)Math.pow(2, p);
				int end = (int)Math.pow(2, p+1);
				for(i=begin; i<end; ++i){
					if(i > num)
						break;
					int temp = begin/2;
					if(i < begin +temp)
						arr[i] = arr[i-temp];
					else
						arr[i] = arr[i-temp]+1;
				}
				p++;
			}
		}
		return arr;
	}
}

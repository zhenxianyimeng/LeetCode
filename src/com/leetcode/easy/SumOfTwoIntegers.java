package com.leetcode.easy;

public class SumOfTwoIntegers {
	public static void main(String[] args) {
		int a=2;
		int b=3;
		System.out.println(getSum(a, b));
	}
	public static int getSum(int a, int b) {
		if(b==0)
			return a;
		return getSum(a^b, (a&b)<<1);
	}
}

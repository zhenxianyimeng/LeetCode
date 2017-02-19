package com.leetcode.easy;

public class NumberComplement {
	public static void main(String[] args) {
		System.out.println(findComplement(2));
		System.out.println(findComplement(5));
		System.out.println(findComplement(1));
	}
	public static int findComplement(int num) {
        int comp = 0;
        if(num == 0)
        	return 1;
        int i=0;
        while(num >= 1){
        	int temp = 1 - num %2;
        	comp = (int) (comp + temp*Math.pow(2, i));
        	num = num/2;
        	i++;
        }
        return comp;
    }
}

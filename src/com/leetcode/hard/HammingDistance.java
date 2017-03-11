package com.leetcode.hard;

import java.util.Scanner;

public class HammingDistance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.println(hammingDistance(n, m));
	}
	
    public static int hammingDistance(int x, int y) {
    	int xor = x^y;
        int temp = xor;
        int re=0;
        int dis = 0;
        while(temp >0){
        	temp = temp>>1;
        	re++;
        }
        int n = 1;
        while(re>=1){
        	int t = xor & n;
        	if(t > 0)
        		dis++;
        	re--;
        	n = n<<1;
        }
    	return dis;
    }
}

/*
The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, calculate the Hamming distance.

Note:
0 ¡Ü x, y < 231.

Example:

Input: x = 1, y = 4

Output: 2

Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ¡ü   ¡ü

The above arrows point to positions where the corresponding bits are different.
*/
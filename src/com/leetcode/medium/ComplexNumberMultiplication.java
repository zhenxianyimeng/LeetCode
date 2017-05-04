package com.leetcode.medium;

import java.util.Scanner;

public class ComplexNumberMultiplication {
	public static void main(String[] args) {
		System.out.println(complexNumberMultiply("1+-1i", "1+-1i"));
	}

	public static String complexNumberMultiply(String a, String b) {
		int indexa = a.indexOf('+');
		int indexb = b.indexOf('+');
		int numa = Integer.parseInt(a.substring(0, indexa));
		int numb = Integer.parseInt(a.substring(indexa+1, a.length()-1));
		
		int numc = Integer.parseInt(b.substring(0, indexb));
		int numd = Integer.parseInt(b.substring(indexb+1, b.length()-1));
		
		int outA = numa*numc - numb*numd;
		int outB = numa*numd + numb*numc;
		
		
		//System.out.println(a.substring(0, indexa));
		//System.out.println(a.substring(indexa+1, a.length()-1));
		
		return outA+"+"+outB+"i";
	}
}

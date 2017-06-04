package com.leetcode.easy;

import java.util.Scanner;
import java.util.Stack;

public class T001 {
	public static void main(String[] args) {
		String s = "123";
		System.out.println(reverseString(s));
	}
    public static String reverseString(String s) {
        if(s==null)
        	return s;
        else {
			int length = s.length();
			if(length==0 || length==1)
				return s;
			else{
				StringBuilder rs = new StringBuilder();
				for(int i=0; i<length; i++){
					rs.insert(0, s.charAt(i));
				}
		
				return rs.toString();
 			}
		}
    }
}

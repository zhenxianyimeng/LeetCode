package com.leetcode.easy;

public class ReverseWorldsInAStringIII {
	
	public static void main(String[] args) {
		System.out.println(reverseWords("Let's take LeetCode contest"));
	}
	
	public static String reverseWords(String s) {
		if(s == null)
			return null;
		char[] chs = s.toCharArray();
		int from = 0;
		int len = chs.length;
		for(int i=0; i<len; i++){
			if(chs[i] == ' '){
				reverseChars(chs, from, i-1);
				from = i+1;
			}
		}
		reverseChars(chs, from, len-1);
		
		return new String(chs);
	}
	
	public static void reverseChars(char[] chs, int from, int end){
		while(from < end){
			char temp = chs[end];
			chs[end] = chs[from];
			chs[from] = temp;
			from++;
			end--;
		}
	}	
}

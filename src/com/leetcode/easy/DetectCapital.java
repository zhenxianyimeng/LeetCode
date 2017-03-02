package com.leetcode.easy;

public class DetectCapital {
	public static void main(String[] args) {
		//System.out.println(new String("ABC").toLowerCase());
		//System.out.println('A'-'a');
		System.out.println(detectCapitalUse("aGoogle"));
	}

	public static boolean detectCapitalUse(String word) {
		char[] lowWords = word.toLowerCase().toCharArray();
		char[] words = word.toCharArray();
		int sum = 0;
		int len = lowWords.length;
		for(int i=0; i<len; i++){
			sum += lowWords[i] - words[i];
		}
		if(sum==0 || sum==32*len)
			return true;
		else if(sum==32 && lowWords[0] - words[0] == 32)
			return true;
		else
		    return false;
	}
}

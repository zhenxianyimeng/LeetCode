package com.leetcode.easy;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class KeyboardRow {
	public static void main(String[] args) {
		String[] words = {"Hello", "Alaska", "Dad", "Peace"};
		String[] results = findWords(words);
		for(int i=0; i<results.length; i++){
			System.out.println(results[i]);
		}
	}
	
	public static String[] findWords(String[] words) {
		List<String> liststr = new LinkedList<>();
		Set<Character> line1 = new HashSet<Character>(){{add('Q');add('W');add('E');add('R');
		add('T');add('Y');add('U');add('I');add('O');add('P');
		}};
		Set<Character> line2 = new HashSet<Character>(){{add('A');add('S');add('D');
		add('F');add('G');add('H');add('J');add('K');add('L');
		}};
		Set<Character> line3 = new HashSet<Character>(){{
			add('Z');add('X');add('C');add('V');add('B');add('N');add('M');
		}};
		Set[] lines = {line1,line2,line3};
		for(int i=0; i<words.length; i++){
			String temp = words[i].toUpperCase();
			boolean flag = true;
			for(int l=0; l<3; l++){
				flag = true;
				for(int j=0; j<temp.length(); j++){
					if(!lines[l].contains(temp.charAt(j))){
						flag = false;
						break;
					}
				}
				if(flag){
					liststr.add(words[i]);
					break;
				}
			}
		}
		String[] results = {};
		if(!liststr.isEmpty())
			results = new String[liststr.size()];
		int i = 0;
		for(String str : liststr){
			results[i] = str;
			i++;
		}
		return results;
	}	
}

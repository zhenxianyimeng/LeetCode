package com.leetcode.weekly.contest190;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-05-24
 * @time: 10:39
 */
public class T001 {

    public static void main(String[] args) {
        String sentence = "i am tired";
        String word = "you";
        System.out.println(new T001().isPrefixOfWord(sentence, word));
    }

    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] arr = sentence.split(" ");
        for (int i = 0; i <arr.length ; i++) {
            String s = arr[i];
            if(searchWord.length() > s.length()){
                continue;
            }
            boolean flag = true;
            for (int j = 0; j <searchWord.length() ; j++) {
                if(searchWord.charAt(j) != s.charAt(j)){
                    flag = false;
                    break;
                }
            }
            if(flag){
                return i+1;
            }
        }
        return -1;
    }
}

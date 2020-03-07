package com.twoweekly.contest21;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-03-07
 * @time: 22:38
 */
public class T5336 {

    public static void main(String[] args) {
        String in = "leetcode";
        System.out.println(new T5336().sortString(in));
    }

    public String sortString(String s) {
        StringBuilder sb = new StringBuilder();
        int[] counts = new int[26];
        for (int i = 0; i <s.length() ; i++) {
            counts[s.charAt(i) - 'a'] ++;
        }
        int num = s.length();
        int index = 0;
        int d = 1;
        while (num > 0){
            if(counts[index] > 0){
                sb.append((char) (index + 'a'));
                counts[index] -- ;
                num --;
            }
            index += d;
            if(index == -1){
                d = 1;
                index = 0;
            }
            if(index == 26){
                d = -1;
                index = 25;
            }
        }
        return sb.toString();
    }
}

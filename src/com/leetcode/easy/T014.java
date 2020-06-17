package com.leetcode.easy;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-06-15
 * @time: 19:18
 */
public class T014 {

    public static void main(String[] args) {
        String[] arr = {"dog","racecar","car"};
        System.out.println(new T014().longestCommonPrefix(arr));
    }

    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0){
            return "";
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <strs.length ; i++) {
            if(min > strs[i].length()){
                min = strs[i].length();
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <min ; i++) {
            boolean all = true;
            for (int j = 1; j <strs.length; j++) {
                if(strs[j].charAt(i) != strs[j-1].charAt(i)){
                    all = false;
                    break;
                }
            }
            if(all){
                sb.append(strs[0].charAt(i));
            }else {
                break;
            }
        }
        return sb.toString();
    }
}

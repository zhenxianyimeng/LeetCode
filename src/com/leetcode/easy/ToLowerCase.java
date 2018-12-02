package com.leetcode.easy;

/**
 * @author zjb
 * @date 2018/11/11.
 */
public class ToLowerCase {

    public static String toLowerCase(String str) {
        if(str==null || "".equals(str)){
            return str;
        }
        char[] chs = str.toCharArray();
        for (int i = 0; i <chs.length ; i++) {
            if(chs[i]>='A' && chs[i]<='Z'){
                chs[i] = (char) (chs[i] - 'A' + 'a');
            }
        }
        return new String(chs);
    }

    public static void main(String[] args) {
        System.out.println(toLowerCase("Hello"));
        System.out.println(toLowerCase("LOVELY"));
    }
}

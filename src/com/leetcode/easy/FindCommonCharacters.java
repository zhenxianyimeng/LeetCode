package com.leetcode.easy;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author zjb
 * @date 2019/3/15.
 */
public class FindCommonCharacters {
    public static void main(String[] args) {
        String[] A = {"bella","label","roller"};
        System.out.println(commonChars(A));
    }

    public static List<String> commonChars(String[] A) {
        List<String> result = new LinkedList<>();
        int[] min = new int[26];
        for (int i = 0; i <26 ; i++) {
            min[i] = Integer.MAX_VALUE;
        }
        for(String temp : A){
            char[] chs = temp.toCharArray();
            int[] count = new int[26];
            for (int i = 0; i <chs.length ; i++) {
                ++count[chs[i] - 'a'];
            }
            for (int i = 0; i <26 ; i++) {
                min[i] = Math.min(min[i], count[i]);
            }
        }
        for (int i = 0; i <26 ; i++) {
            while (min[i] > 0){
                result.add(String.valueOf((char)('a' + i)));
                min[i]--;
            }
        }
        return result;
    }
}

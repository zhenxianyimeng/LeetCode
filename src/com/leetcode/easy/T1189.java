package com.leetcode.easy;

import java.util.Map;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2022-02-13
 * @time: 22:10
 * balloon
 */
public class T1189 {
    public static void main(String[] args) {
        String str = "loonbalxballpoonballoo";
        System.out.println(new T1189().maxNumberOfBalloons(str));
    }

    public int maxNumberOfBalloons(String text) {
        if (text == null || text.length() < 7) {
            return 0;
        }
        int[] arr = new int[26];
        for (int i = 0; i <text.length() ; i++) {
            arr[text.charAt(i) - 'a'] += 1;
        }
        int min = arr[0];
        if (arr[1] < min) {
            min = arr[1];
        }
        if (arr['l' - 'a'] / 2 < min) {
            min = arr['l' - 'a'] / 2;
        }
        if (arr['o' - 'a'] / 2 < min) {
            min = arr['o' - 'a'] / 2;
        }
        if (arr['n' - 'a'] < min) {
            min = arr['n' - 'a'];
        }
        return min;
    }
}

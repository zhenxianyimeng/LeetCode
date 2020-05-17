package com.leetcode.weekly.contest189;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-05-17
 * @time: 10:37
 */
public class T002 {
    public static void main(String[] args) {
        System.out.println(new T002().arrangeWords("To be or not to be"));
    }

    public String arrangeWords(String text) {
        String[] arr = text.split(" ");
        arr[0] = arr[0].toLowerCase();
//        for (int i = 0; i < arr.length; i++) {
//
//        }
        for (int i = 1; i <arr.length ; i++) {
            String temp = arr[i];
            int j;
            for (j = i - 1; j >=0 ; j--) {
                if(arr[j].length() > temp.length()){
                    arr[j+1] = arr[j];
                }else {
                    break;
                }
            }
            arr[j+1] = temp;
        }
        arr[0] = (char)(arr[0].charAt(0) -32) + arr[0].substring(1);
        return String.join(" ", arr);
    }

}

package com.leetcode.weekly.contest188;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-05-10
 * @time: 11:50
 */
public class T001 {
    public static void main(String[] args) {
        int[] arr = {2,3,4};
        System.out.println(new T001().buildArray(arr, 4));
    }

    public List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i <target.length ; i++) {
            if(target[i] == i+1){
                list.add("PUSH");
            }else {
                for (int j = 0; j <target[i] - (i+1) ; j++) {
                    list.add("PUSH");
                    list.add("POP");
                }
                list.add("PUSH");
            }
        }
        return list;
    }
}

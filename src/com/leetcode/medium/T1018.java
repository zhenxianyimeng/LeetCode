package com.leetcode.medium;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2021-01-14
 * @time: 23:43
 */
public class T1018 {
    public static void main(String[] args) {
//        int[] A = {1,0,1,1,1,1,0,0,0,0,1,0,0,0,0,0,1,0,0,1,1,1,1,1,0,0,0,0,1,1,1,0,0,0,0,0,1,0,0,0,1,0,0,1,1,1,1,1,1,0,1,1,0,1,0,0,0,0,0,0,1,0,1,1,1,0,0,1,0};
        int[] A = {0,1,1};
        List<Boolean> booleans = new T1018().prefixesDivBy5(A);
        for (Boolean b : booleans){
            System.out.println(b);
        }
    }

    public List<Boolean> prefixesDivBy5(int[] A) {
        if(A == null){
            return null;
        }
        List<Boolean> list = new ArrayList<>(A.length);
        int num = 0;
        for (int i = 0; i <A.length ; i++) {
            num = ((num<<1) + A[i]) % 5;
            if (num == 0){
                list.add(true);
            }else {
                list.add(false);
            }
//            num = num << 1;
        }
        return list;
    }
}

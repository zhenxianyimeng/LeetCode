package com.twoweekly.contest20;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-02-22
 * @time: 22:32
 */
public class T5323 {


    public int[] sortByBits(int[] arr) {
        Integer[] arrays = new Integer[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            arrays[i] = new Integer(arr[i]);
        }
        Arrays.sort(arrays, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int a = (int)o1;
                int b = (int)o2;
                int numA  = findOnes(a);
                int numB = findOnes(b);
                if(numB == numA){
                    return a - b;
                }else {
                    return numA - numB;
                }            }

        });
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = arrays[i];
        }
        return arr;
    }

    public int findOnes(int a){
        int num = 0;
        while (a > 0){
            int temp = a % 2;
            if (temp == 1){
                num ++;
            }
            a = a/2;
        }
        return num;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(new T5323().sortByBits(arr)));
    }
}

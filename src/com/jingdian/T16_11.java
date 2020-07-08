package com.jingdian;

import java.util.Arrays;

/**
 * Description:
 * 数学思维
 * @author: chixiao
 * @date: 2020-07-08
 * @time: 20:03
 */
public class T16_11 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new T16_11().divingBoard(1,1,10)));
    }

    public int[] divingBoard(int shorter, int longer, int k) {
        if(k == 0){
            return new int[0];
        }
        if(shorter == longer){
            int[] arr = new int[1];
            arr[0] = k * shorter;
            return arr;
        }
        int[] arr = new int[k+1];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = i * longer + shorter * (k - i);
        }
        return arr;
    }
}

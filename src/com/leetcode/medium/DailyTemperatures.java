package com.leetcode.medium;

import java.util.Arrays;
import java.util.Stack;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2019-08-14
 * @time: 22:24
 */
public class DailyTemperatures {
    public static void main(String[] args) {
        int[] arr = {73, 74, 75, 71, 69, 72, 76, 73};
        System.out.println(Arrays.toString(new DailyTemperatures().dailyTemperatures(arr)));
    }

    public int[] dailyTemperatures(int[] T) {
        if(T==null && T.length==0){
            return T;
        }
        int[] result = new int[T.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i <T.length; i++) {
            while (!stack.isEmpty() && T[i] > T[stack.peek()]){
                int j = stack.pop();
                result[j] = i-j;
            }
            stack.push(i);
        }
        return result;
    }
}

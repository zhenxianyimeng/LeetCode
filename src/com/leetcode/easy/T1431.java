package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-06-01
 * @time: 10:43
 */
public class T1431 {

    public static void main(String[] args) {
        int[] arr = {2,3,5,1,3};
        System.out.println(new T1431().kidsWithCandies(arr, 3));
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        List<Boolean> res = new ArrayList<>();
        for (int i = 0; i <candies.length ; i++) {
            if(candies[i] > max){
                max = candies[i];
            }
        }
        for (int n : candies){
            if((n + extraCandies) >= max){
                res.add(true);
            }else {
                res.add(false);
            }
        }
        return res;
    }
}

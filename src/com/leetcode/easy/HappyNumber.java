package com.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-03-30
 * @time: 13:24
 */
public class HappyNumber {

    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet();
        set.add(n);
        while (n > 1){
            int sum = 0;
            while (n > 0){
                int t = n % 10;
                sum += t * t;
                n = n/10;
            }
            if(set.contains(sum)){
                return false;
            }
            set.add(sum);
            n = sum;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new HappyNumber().isHappy(19));
    }
}

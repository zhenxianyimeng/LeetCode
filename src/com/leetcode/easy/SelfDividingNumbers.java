package com.leetcode.easy;

import java.util.LinkedList;
import java.util.List;

public class SelfDividingNumbers {
    public static void main(String[] args) {
        SelfDividingNumbers s = new SelfDividingNumbers();
        List<Integer> list = s.selfDividingNumbers(1,22);
        list.forEach(a-> System.out.println(a));
    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new LinkedList<>();
        for (int i = left; i <=right ; i++) {
            if(isSelfDividing(i)){
                list.add(i);
            }
        }
        return list;
    }

    public boolean isSelfDividing(int num){
        int tmp = num;
        while (tmp > 0){
            int d = tmp % 10;
            if(d == 0 || num % d !=0){
                return false;
            }
            tmp = tmp/10;
        }

        return true;
    }
}

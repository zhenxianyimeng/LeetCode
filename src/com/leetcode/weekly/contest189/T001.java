package com.leetcode.weekly.contest189;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-05-17
 * @time: 10:34
 */
public class T001 {

    public static void main(String[] args) {
        int[] startTime = {1,2,3};
        int[] endTime = {3,2,7};
        System.out.println(new T001().busyStudent(startTime, endTime, 4));
    }

    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int sum = 0;
        for (int i = 0; i <startTime.length ; i++) {
            if(startTime[i]<=queryTime && endTime[i]>=queryTime){
                sum++;
            }
        }
        return sum;
    }
}

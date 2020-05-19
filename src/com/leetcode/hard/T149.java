package com.leetcode.hard;

import com.leetcode.weekly.contest138.MaxSatisfied;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-05-19
 * @time: 21:34
 */
public class T149 {
    public static void main(String[] args) {
        int[][] arr = {{1,1}, {3,2},{5,3},{4,1},{2,3},{1,4}};
        System.out.println(new T149().maxPoints(arr));
//        System.out.println(new T149().getGcd(-16,4));
    }

    public int maxPoints(int[][] points) {
        Map<String, Integer> map = new HashMap<>();
        if(points.length <= 2){
            return points.length;
        }
        int result = 0;
        for (int i = 0; i <points.length ; i++) {
            int same = 1;
            int max = 0;
            map.clear();
            for (int j = i+1; j <points.length ; j++) {
                int dx = points[i][0] - points[j][0];
                int dy = points[i][1] - points[j][1];
                if(dx == 0 && dy == 0){
                    same++;
                    continue;
                }
                int gcd = getGcd(dx, dy);
                dx = dx/gcd;
                dy = dy/gcd;
                String key = dx + ":" + dy;
                Integer value = map.get(key);
                if(value == null){
                    map.put(key, 1);
                }else {
                    map.put(key, value + 1);
                }
                max = Math.max(max, map.get(key));
            }
            result=Math.max(result, max+same);
        }

        return result;
    }

    private int getGcd(int a, int b){
        if (b == 0)
            return a;
        return getGcd(b, a%b);
    }



}

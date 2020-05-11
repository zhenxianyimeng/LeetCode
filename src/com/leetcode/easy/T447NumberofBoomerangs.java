package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-05-11
 * @time: 19:37
 */
public class T447NumberofBoomerangs {
    public static void main(String[] args) {
        int[][] arr = {{0,0}, {1,0}, {-1,0}, {0,1}, {0, -1}};
        System.out.println(new T447NumberofBoomerangs().numberOfBoomerangs(arr));
    }

    public int numberOfBoomerangs(int[][] points) {
        int sum = 0;
        for (int i = 0; i <points.length ; i++) {
            Map<Integer, Integer> tempMap = new HashMap<>();
            for (int j = 0; j <points.length ; j++) {
                if(i != j){
                    int dis = (points[i][0] - points[j][0]) * (points[i][0] - points[j][0]) +
                            (points[i][1] - points[j][1]) * (points[i][1] - points[j][1]);
                    Integer value = tempMap.get(dis);
                    if(value == null){
                        tempMap.put(dis, 1);
                    }else {
                        tempMap.put(dis, value + 1);
                    }
                }
            }
            for(Integer v : tempMap.values()){
                sum += v * (v-1);
            }
        }
        return sum;
    }
}

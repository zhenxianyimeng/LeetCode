package com.leetcode.weekly.contest175;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-02-09
 * @time: 11:11
 */
public class T5333 {

    public int minSteps(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        int step = 0;
        char[] chS = s.toCharArray();
        for (int i = 0; i <chS.length ; i++) {
            if(map.containsKey(chS[i])){
                map.put(chS[i], map.get(chS[i]) + 1);
            }else {
                map.put(chS[i], 1);
            }
        }
        char[] chT = t.toCharArray();
        for (int i = 0; i <chT.length ; i++) {
            if(map.containsKey(chT[i])){
                int num = map.get(chT[i]);
                if(num > 0){
                    map.put(chT[i], num - 1);
                }else {
                    step ++;
                    map.remove(chT[i]);
                }
            }else {
                step ++;
            }
        }
        return step;
    }

    public static void main(String[] args) {
        String s = "friend";
        String t = "family";
        System.out.println(new T5333().minSteps(s, t));
    }
}

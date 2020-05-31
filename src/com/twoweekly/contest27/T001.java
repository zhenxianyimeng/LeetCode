package com.twoweekly.contest27;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-05-30
 * @time: 22:35
 */
public class T001 {

    public static void main(String[] args) {
        int[] target = {1,1,1};
        int[] arr = {1,1,1};
        System.out.println(new T001().canBeEqual(target, arr));
    }

    public boolean canBeEqual(int[] target, int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int t : target){
            Integer value = map.get(t);
            if(value == null){
                map.put(t, 1);
            }else {
                map.put(t, value + 1);
            }
        }
        for (int a : arr){
            Integer value = map.get(a);
            if(value == null){
                return false;
            }
            if(value == 1){
                map.remove(a);
                continue;
            }
            map.put(a, value-1);

        }
        return true;
    }
}

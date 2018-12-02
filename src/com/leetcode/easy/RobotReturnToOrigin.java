package com.leetcode.easy;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author zjb
 * @date 2018/12/2.
 */
public class RobotReturnToOrigin {
    public static void main(String[] args) {
        String str = "LL";
        System.out.println(judgeCircle(str));
    }

    public static boolean judgeCircle(String moves) {
        LinkedList<Character> list = new LinkedList<>();
        char[] arr = moves.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for(char ch: arr){
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }else {
                map.put(ch, 1);
            }
        }

        if(map.containsKey('L')){
            Integer r = map.get('R');
            if(!map.get('L').equals(r)){
                return false;
            }
        }

//        if(map.containsKey('R')){
//            Integer r = map.get('L');
//            if(!map.get('R').equals(r)){
//                return false;
//            }
//        }

        if(map.containsKey('D')){
            Integer u = map.get('U');
            if(!map.get('D').equals(u)){
                return false;
            }
        }
//
//        if(map.containsKey('U')){
//            Integer u = map.get('D');
//            if(!map.get('U').equals(u)){
//                return false;
//            }
//        }

        return true;
    }
}

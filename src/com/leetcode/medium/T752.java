package com.leetcode.medium;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-07-16
 * @time: 19:54
 */
public class T752 {

    public static void main(String[] args) {
        String[] deadends = {"0201","0101","0102","1212","2002"};
        String target = "0202";
//        String [] deadends = {"0000"};
//        String target = "8888";
        System.out.println(new T752().openLock(deadends, target));
//        System.out.println('0'-'0' +1);
    }

    public int openLock(String[] deadends, String target) {
        Queue<String> queue = new LinkedList<>();
        queue.add("0000");
        int step = 0;
        Set<String> visit = new HashSet<>();
        Set<String> deads = new HashSet<>();
        for (String str : deadends){
            deads.add(str);
        }
        visit.add("0000");
        while (!queue.isEmpty()){
            int n = queue.size();
//            System.out.println("size:"+ n + "-step:"+step);
            for (int i = 0; i <n ; i++) {
                String s = queue.poll();
//                System.out.println(s);
                if(deads.contains(s)){
                    continue;
                }
                if(s.equals(target)){
                    return step;
                }
                for (int j = 0; j <4 ; j++) {
                    String down = down(s.toCharArray(), j);
                    if(!visit.contains(down)){
                        queue.add(down);
                        visit.add(down);;
                    }

                    String up = up(s.toCharArray(), j);
                    if(!visit.contains(up)){
                        queue.add(up);
                        visit.add(down);
                    }

                }
            }
            step++;
        }
        return -1;
    }

    private String up(char[] chs, int index){
        if(chs[index] == '9'){
            chs[index] = '0';
        }else {
            chs[index] = (char) (chs[index]  + 1);
        }
        return new String(chs);
    }

    private String down(char[] chs, int index){
        if(chs[index] == '0'){
            chs[index] = '9';
        }else {
            chs[index] = (char) (chs[index] - 1);
        }
        return new String(chs);
    }

}

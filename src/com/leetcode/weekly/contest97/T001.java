package com.leetcode.weekly.contest97;

import java.util.*;

/**
 * @author zjb
 * @date 2018/8/12.
 */
public class T001 {
    public static void main(String[] args) {
        String A = "apple apple";
        String B = "banana";
        String[] re = uncommonFromSentences(A, B);
        Arrays.asList(re).forEach(System.out::println);
    }

    public static String[] uncommonFromSentences(String A, String B) {
        List<String> re = new LinkedList<>();
        List<String> listA = new ArrayList<>();
        listA.addAll(Arrays.asList(A.split(" ")));

        List<String> listB = new ArrayList<>();
        listB.addAll(Arrays.asList(B.split(" ")));
        Set<String> tempA = new HashSet<>();
        for(int i=0; i<listA.size(); i++){
            String s = listA.get(i);
            if(!tempA.contains(s)){
                tempA.add(s);
            }else {
                if(listA.contains(s)){
                    listA.remove(s);
                }
            }
        }
        Set<String> tempB = new HashSet<>();
        for(int i=0; i<listB.size(); i++){
            String s = listB.get(i);
            if(!tempB.contains(s)){
                tempB.add(s);
            }else {
                if(listB.contains(s)){
                    listB.remove(s);
                }
            }
        }

        for(String s : listA){
            if(!tempB.contains(s)){
                re.add(s);
            }
        }

        for(String s : listB){
            if(!tempA.contains(s)){
                re.add(s);
            }
        }
        if(re.isEmpty()){
            return null;
        }else {
            String[] a = new String[re.size()];
            for (int i = 0; i <re.size() ; i++) {
                a[i] = re.get(i);
            }
            return a;
        }

    }
}

package com.leetcode.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2021-01-09
 * @time: 18:09
 */
public class T39 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5};
        int target = 8;
        List<List<Integer>> lists = new T39().combinationSum(arr, target);
        for (List<Integer> list : lists) {
            for (Integer integer : list) {
                System.out.print(integer);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    private List<List<Integer>> lists = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (candidates == null || candidates.length == 0 || target <= 0){
            return lists;
        }
        List<Integer> list = new ArrayList<>();
        processOne(0,candidates, target, list);
        return lists;
    }


    public void processOne(int start, int[] candidates, int target, List<Integer> list){
        if (target < 0){
            return;
        }
        if (target == 0){
            lists.add(new ArrayList<>(list));
            return;
        }
        for (int i = start; i <candidates.length ; i++) {
            int temp = candidates[i];
            list.add(temp);
            processOne(i, candidates, target - temp, list);
            list.remove(list.size() - 1);
        }
    }
}

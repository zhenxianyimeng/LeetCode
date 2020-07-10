package com.leetcode.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-07-10
 * @time: 16:55
 */
public class T46 {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};
        List<List<Integer>> permute = new T46().permute(nums);
        for (List<Integer> list : permute){
            System.out.println(list);
        }
    }

    private List<List<Integer>> result;

    public List<List<Integer>> permute(int[] nums) {
        result = new ArrayList<>();
        List<Integer> choice = new ArrayList<>();
        tmpBack(choice, nums);
        return result;
    }

    public void tmpBack(List<Integer> choice, int[] nums){
        if(choice.size() == nums.length){
            result.add(new ArrayList<>(choice));
            return;
        }
        for (int i=0; i<nums.length; i++){
            if(choice.contains(nums[i])){
                continue;
            }
            choice.add(nums[i]);
            tmpBack(choice, nums);
            choice.remove(choice.size() - 1);
        }
    }
}

package com.leetcode.medium;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2019-08-18
 * @time: 21:41
 */
public class Permutations {
    public static void main(String[] args) {
        char[] arrs = {'a','b','c'};
        List<List<Character>> results = new Permutations().permute(arrs);
        for (List<Character> tempList : results){
            System.out.println(String.join(",",
                    tempList.stream().map(s->String.valueOf(s)).collect(Collectors.toList())));
        }
    }

    public List<List<Character>> permute(char[] nums) {
        List<List<Character>> lists = new LinkedList<>();
        tempPermute(nums, 0, lists);
        return lists;
    }

    public void tempPermute(char[] nums, int start, List<List<Character>> lists){
        int len = nums.length;
        if(start == len-1){
            List<Character> l = new LinkedList<>();
            for(char num : nums){
                l.add(num);
            }
            lists.add(l);
            return;
        }
        for(int i=start; i<len; i++){
            char temp = nums[start];
            nums[start] = nums[i];
            nums[i] = temp;
            tempPermute(nums, start+1, lists);
            temp = nums[start];
            nums[start] = nums[i];
            nums[i] = temp;
        }
    }
}

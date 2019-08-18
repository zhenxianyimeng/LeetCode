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
        int[] arrs = {1,2,3};
        List<List<Integer>> results = new Permutations().permute(arrs);
        for (List<Integer> tempList : results){
            System.out.println(String.join(",",
                    tempList.stream().map(s->String.valueOf(s)).collect(Collectors.toList())));
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> lists = new LinkedList<>();
        tempPermute(nums, 0, lists);
        return lists;
    }

    public void tempPermute(int[] nums, int start, List<List<Integer>> lists){
        int len = nums.length;
        if(start == len-1){
            List<Integer> l = new LinkedList<>();
            for(int num : nums){
                l.add(num);
            }
            lists.add(l);
            return;
        }
        for(int i=start; i<len; i++){
            int temp = nums[start];
            nums[start] = nums[i];
            nums[i] = temp;
            tempPermute(nums, start+1, lists);
            temp = nums[start];
            nums[start] = nums[i];
            nums[i] = temp;
        }
    }
}

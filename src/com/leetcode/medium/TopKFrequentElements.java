package com.leetcode.medium;

import java.util.*;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-03-27
 * @time: 19:00
 */
public class TopKFrequentElements {

    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n : nums){
            Integer count = map.get(n);
            if(count == null){
                map.put(n, 1);
            }else {
                map.put(n, count+1);
            }
        }
        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>(k,(Comparator<Map.Entry>)
                (o1, o2) -> ((Integer) o1.getValue()) - ((Integer) o2.getValue()));
        for (Map.Entry e : map.entrySet()){
            queue.add(e);
            if(queue.size() > k){
                queue.poll();
            }
        }
        Integer[] arr = new Integer[k];
        int index = k - 1;
        while (queue.size()>0){
            arr[index--] = queue.poll().getKey();
        }
        return Arrays.asList(arr);
    }

    public static void main(String[] args) {
        int[] nums = {1, -2, -2, 1, 1};
        int k = 2;
        System.out.println(new TopKFrequentElements().topKFrequent(nums, k));
    }
}

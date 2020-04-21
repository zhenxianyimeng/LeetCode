package com.leetcode.medium;

import java.util.*;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-04-10
 * @time: 12:58
 */
public class ThreeSum {

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> lists = new ThreeSum().threeSum(nums);
        for (List<Integer> list : lists) {
            System.out.println(Arrays.toString(list.toArray()));
        }

    }

//    public static List<List<Integer>> threeSum(int[] nums) {
//        List<List<Integer>> ans = new ArrayList();
//        int len = nums.length;
//        if(nums == null || len < 3) return ans;
//        Arrays.sort(nums); // 排序
//        for (int i = 0; i < len ; i++) {
//            if(nums[i] > 0) break; // 如果当前数字大于0，则三数之和一定大于0，所以结束循环
//            if(i > 0 && nums[i] == nums[i-1]) continue; // 去重
//            int L = i+1;
//            int R = len-1;
//            while(L < R){
//                int sum = nums[i] + nums[L] + nums[R];
//                if(sum == 0){
//                    ans.add(Arrays.asList(nums[i],nums[L],nums[R]));
//                    while (L<R && nums[L] == nums[L+1]) L++; // 去重
//                    while (L<R && nums[R] == nums[R-1]) R--; // 去重
//                    L++;
//                    R--;
//                }
//                else if (sum < 0) L++;
//                else if (sum > 0) R--;
//            }
//        }
//        return ans;
//    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new LinkedList();
        if(nums == null || nums.length < 3)
            return list;
        Arrays.sort(nums);
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i] > 0){
                break;
            }
            if(i>0 && nums[i] == nums[i-1]) continue;
            int L = i+1;
            int R = nums.length - 1;
            while(L < R){
                int sum = nums[i] + nums[L] + nums[R];
                if(sum == 0){
                    list.add(Arrays.asList(nums[i],nums[L],nums[R]));
                    while (L<R && nums[L] == nums[L+1]) {L++;} // 去重
                    while (L<R && nums[R] == nums[R-1]) {R--;} // 去重
                    L++;
                    R--;
                }
                else if (sum < 0) L++;
                else if (sum > 0) R--;
            }
        }
        return list;
    }

//    public List<List<Integer>> threeSum(int[] nums) {
//        Arrays.sort(nums);
//        List<List<Integer>> list = new LinkedList();
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            map.put(nums[i], i);
//        }
//        Set<String> set = new HashSet<>();
//        for (int i = 0; i < nums.length - 1; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                int key = -(nums[i] + nums[j]);
//                Integer value = map.get(key);
//                Integer[] arrs = {nums[i], nums[j], key};
////                Arrays.sort(arrs);
//                String d = arrs[0] + " " + arrs[1] + " " + arrs[2];
//                if (map.containsKey(key) && value != i && value != j && !set.contains(d)) {
//                    list.add(Arrays.asList(arrs));
//                    set.add(d);
//                }
//            }
//        }
//        if(list.size() == 0){
//            return list;
//        }
//        List<List<Integer>> result = new LinkedList();
//        List<Integer> before = list.get(0);
//        result.add(list.get(0));
//        for (int i = 1; i <list.size() ; i++) {
//            List<Integer> now = list.get(i);
//            if(before.get(0).equals(now.get(0)) && before.get(1).equals(now.get(1)) && before.get(2).equals(now.get(2))){
//                continue;
//            }else {
//                result.add(list.get(i));
//                before = now;
//            }
//        }
//        return list;
//    }
}

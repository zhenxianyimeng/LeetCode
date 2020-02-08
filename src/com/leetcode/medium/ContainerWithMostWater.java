package com.leetcode.medium;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-02-08
 * @time: 17:13
 */
public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int max = 0;
        for (int i = 0; i <height.length-1 ; i++) {
            for (int j = i+1; j < height.length; j++) {
                int temp = Math.min(height[i], height[j]) * (j-i);
                if(temp > max){
                    max = temp;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr ={1,8,6,2,5,4,8,3,7};
        System.out.println(new ContainerWithMostWater().maxArea(arr));
    }
}

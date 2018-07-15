package com.leetcode.weekly.contest93;

/**
 * @author zjb
 * @date 2018/7/15.
 */
public class T001 {

    public static void main(String[] args) {
        System.out.println(binaryGap(5));
        System.out.println(binaryGap(22));
        System.out.println(binaryGap(6));
        System.out.println(binaryGap(8));
    }
    public static int binaryGap(int N) {
        char[] arr = Integer.toBinaryString(N).toCharArray();
        int max = 0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] == '1'){
                int j=i+1;
                int len = 0;
                while (arr[j] == '0' && j<arr.length-1){
                    j++;
                    len++;
                }
                if(j==arr.length-1 && arr[j] == '0'){
                    len = -1;
                }
                if(len+1 > max){
                    max = len+1;
                }
            }
        }
        return max;
    }
}

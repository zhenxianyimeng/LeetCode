package com.leetcode.easy;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-06-23
 * @time: 09:59
 */
public class T67 {
    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        System.out.println(new T67().addBinary(a, b));
    }

    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int lenA = a.length();
        int lenB = b.length();
        int i = lenA - 1;
        int j = lenB - 1;
        int next = 0;
        while (i>=0 && j>=0){
            int numA = a.charAt(i) - '0';
            int numB = b.charAt(j) - '0';
            int sum = numA + numB + next;
            if(sum >= 2){
                next = 1;
                sum = sum % 2;
            }else {
                next = 0;
            }
            sb.append(sum);
            i--;
            j--;
        }

        while (i>=0){
            int numA = a.charAt(i) - '0';
            int sum = numA + next;
            if(sum >= 2){
                next = 1;
                sum = sum % 2;
            }else {
                next = 0;
            }
            sb.append(sum);
            i--;
        }

        while (j>=0){
            int numB = b.charAt(j) - '0';
            int sum = numB + next;
            if(sum >= 2){
                next = 1;
                sum = sum % 2;
            }else {
                next = 0;
            }
            sb.append(sum);
            j--;
        }
        if(next > 0){
            sb.append(next);
        }
        return sb.reverse().toString();
    }
}

package com.leetcode.easy;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-05-19
 * @time: 14:17
 */
public class T680 {

    public static void main(String[] args) {
        String str = "aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga";
        System.out.println(new T680().validPalindrome(str));
    }

    public boolean validPalindrome(String s) {
        return validPalindrome(s, 0, s.length()-1, 1);
    }

    private boolean validPalindrome(String s, int left, int right, int chance){
        if(left > right){
            return true;
        }
        if(s.charAt(left) == s.charAt(right)){
            return validPalindrome(s, left+1, right-1, chance);
        }else {
            if(chance == 0){
                return false;
            }
            return validPalindrome(s, left+1, right, chance-1)
                    || validPalindrome(s, left, right-1, chance-1);
        }
    }
}

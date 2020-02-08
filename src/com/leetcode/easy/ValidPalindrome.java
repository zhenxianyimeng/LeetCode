package com.leetcode.easy;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-02-08
 * @time: 15:39
 */
public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length()-1;
        s = s.toLowerCase();
        char[] chs = s.toCharArray();
        while (l <= r){
            if (r>0 && !(chs[r]>='a' && chs[r]<='z') && !(chs[r]>='0' && chs[r]<='9')){
                r--;
                continue;
            }
            if (l<s.length()-1 && !(chs[l]>='a' && chs[l]<='z') && !(chs[l]>='0' && chs[l]<='9')){
                l++;
                continue;
            }
            if(chs[l] != chs[r]){
                return false;
            }else {
                r--;
                l++;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";
        System.out.println(new ValidPalindrome().isPalindrome(input));
        input = "race a car";
        System.out.println(new ValidPalindrome().isPalindrome(input));
        input = " ";
        System.out.println(new ValidPalindrome().isPalindrome(input));
        input = ".,";
        System.out.println(new ValidPalindrome().isPalindrome(input));
        input = "0P";
        System.out.println(new ValidPalindrome().isPalindrome(input));
    }
}

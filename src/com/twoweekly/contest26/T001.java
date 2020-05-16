package com.twoweekly.contest26;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-05-16
 * @time: 22:25
 */
public class T001 {
    public static void main(String[] args) {
        String str = "cc";
        System.out.println(new T001().maxPower(str));
    }

    public int maxPower(String s) {
        if(s==null || s.length() == 0){
            return 0;
        }
        if(s.length() == 1){
            return 1;
        }
        int l = 1;
        int max = 0;
        for (int i = 1; i <s.length() ; i++) {
            char before = s.charAt(i - 1);
            char after = s.charAt(i);
            if(before == after){
                l++;
            }else {
                if(l > max){
                    max = l;
                }
                l = 1;
            }
        }
        if(l > max){
            max = l;
        }
        return max;
    }
}

package com.twoweekly.contest19;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-02-08
 * @time: 22:32
 */
public class T5311 {

    public int numberOfSteps (int num) {
        int t = 0;
        while (num > 0){
            if(num % 2 == 0){
                num = num / 2;
                t++;
            }else {
                num = num -1;
                t++;
            }
        }
        return t;
    }

    public static void main(String[] args) {
        int num = 8;
        System.out.println(new T5311().numberOfSteps(num));
    }
}

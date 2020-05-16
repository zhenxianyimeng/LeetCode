package com.twoweekly.contest26;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-05-16
 * @time: 22:39
 */
public class T002 {

    public static void main(String[] args) {
        System.out.println(new T002().simplifiedFractions(6));
    }

    public List<String> simplifiedFractions(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <i ; j++) {
                if(j==1 || i == 2){
                    list.add(j + "/" + i);
                }else {
                    boolean flag = true;
                    for (int k = 2; k <=j ; k++) {
                        if(i % k == 0  && j%k ==0){
                            flag = false;
                            break;
                        }
                    }
                    if(flag){
                        list.add(j + "/" + i);
                    }
                }
            }
        }
        return list;
    }
}

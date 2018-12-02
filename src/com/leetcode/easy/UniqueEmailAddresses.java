package com.leetcode.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @author zjb
 * @date 2018/11/5.
 */
public class UniqueEmailAddresses {
    public static void main(String[] args) {
        String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        System.out.println(numUniqueEmails(emails));
    }

    public static int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for(String email : emails){
            String[] arr = email.split("@");
            String begin = arr[0];
            begin = begin.replaceAll("\\.","");
            if(begin.contains("+")){
                begin = begin.substring(0,begin.indexOf("+"));
            }
            set.add(begin+"@"+arr[1]);
        }
        return set.size();
    }
}

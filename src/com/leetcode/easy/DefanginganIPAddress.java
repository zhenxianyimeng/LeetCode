package com.leetcode.easy;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-05-07
 * @time: 18:16
 */
public class DefanginganIPAddress {

    public static void main(String[] args) {
        System.out.println(new DefanginganIPAddress().defangIPaddr("1.1.1.1"));
    }

    public String defangIPaddr(String address) {
        return address.replaceAll("\\.","[.]");
    }

}

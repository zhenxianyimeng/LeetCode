package com.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2021-01-06
 * @time: 23:43
 */
public class T399 {

    public static void main(String[] args) {
        List<List<String>> equations = new ArrayList<>();
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        equations.add(list);

        List<String> list2 = new ArrayList<>();
        list.add("b");
        list.add("c");
        equations.add(list2);

        double[] values = new double[2];
        values[0] = 2.0;
        values[1] = 3.0;

    }

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        return null;
    }
}

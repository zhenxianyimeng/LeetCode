package com.leetcode.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-07-10
 * @time: 19:45
 */
public class T51 {

    public static void main(String[] args) {
        List<List<String>> lists = new T51().solveNQueens(4);
        for (List<String> list : lists){
            System.out.println(list);
        }
    }

    private List<List<String>> result;

    public List<List<String>> solveNQueens(int n) {
        result = new ArrayList<>();
        List<char[]> choice = new ArrayList<>();
        char[] ch = new char[n];
        for (int i = 0; i <n ; i++) {
            ch[i] = '.';
        }
        for (int i = 0; i <n ; i++) {
            choice.add(Arrays.copyOf(ch, ch.length));
        }
        tempBack(0, choice);
        return result;
    }

    public void tempBack(int rows, List<char[]> choice){
        if(rows == choice.size()){
            result.add(choice.stream().map(ch->new String(ch)).collect(Collectors.toList()));
            return;
        }
        for (int i = 0; i <choice.get(rows).length ; i++) {
            if(!isValid(rows, i, choice)){
                continue;
            }
            choice.get(rows)[i] = 'Q';
            tempBack(rows+1, choice);
            choice.get(rows)[i] = '.';
        }

    }

    private boolean isValid(int rows, int col, List<char[]> choice){
        //竖着
        for (int i = 0; i <choice.size() ; i++) {
            if(choice.get(i)[col] == 'Q'){
                return false;
            }
        }

        //右上
        for (int i = rows-1, j = col+1; i >=0 & j<choice.size(); i--, j++) {
            if(choice.get(i)[j] == 'Q'){
                return false;
            }
        }

        //左上
        for (int i = rows-1, j=col-1; i >=0 & j>=0 ; i--,j--) {
            if(choice.get(i)[j] == 'Q'){
                return false;
            }
        }

        return true;

    }
}

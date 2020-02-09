package com.twoweekly.contest19;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-02-08
 * @time: 23:02
 */
public class T5314 {

    public int minJumps(int[] arr) {
        return tempJump(arr, arr.length - 1);
    }

    private int tempJump(int[] arr, int to){
        if(to == 0){
            return 0;
        }
        int min = tempJump(arr, to - 1) + 1;
        int i = to-1;
        for (; i >=0 ; i--) {
            if(arr[i] == arr[to]){
                int step = tempJump(arr, i) + 1;
                if(step < min){
                    min = step;
                }
                for (int j = i + 1; j < to ; j++) {
                    if(arr[0] == arr[j]){
                        step = tempJump(arr, j) + j - i + 1;
                        if(step < min){
                            min = step;
                        }
                    }
                }
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {68,-94,-44,-18,-1,18,-87,29,-6,-87,-27,37,-57,7,18,68,-59,29,7,53,-27,-59,18,-1,18,-18,-59,-1,-18,-84,-20,7,7,-87,-18,-84,-20,-27};
        System.out.println(new T5314().minJumps(arr));
    }
}

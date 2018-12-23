package com.leetcode.medium;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @author zjb
 * @date 2018/12/19.
 */
public class RevealCardsInIncreasingOrder {

    public static void main(String[] args) {
        int[] arr = {17,13,11,2,3,5,7};
        arr = deckRevealedIncreasing(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        LinkedList<Integer> queue = new LinkedList<>();
//        System.out.println(Arrays.toString(deck));
        for(int i=deck.length-1; i>=0; i--){
            if(!queue.isEmpty()){
                int t = queue.pollLast();
                queue.addFirst(t);
                queue.addFirst(deck[i]);
            }else {
                queue.addFirst(deck[i]);
            }
        }
        for (int i = 0; i <queue.size() ; i++) {
           deck[i] = queue.get(i);
        }
        return deck;
    }
}

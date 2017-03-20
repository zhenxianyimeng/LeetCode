package com.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;


public class QueueReconstructionbyHeight {
	public static void main(String[] args) {
		int[][] people = {{8,2},{4,2},{4,5},{2,0},{7,2},{1,4},{9,1},{3,1},{9,0},{1,0}};
		people = reconstructQueue(people);
		for(int[] arr : people){
			for(int p : arr)
				System.out.print(p+" ");
			System.out.println();
		}
	}
	
    public static int[][] reconstructQueue(int[][] people) {
        if(people == null || people.length == 0 || people[0].length == 0)
        	return new int[0][0];
        
        Arrays.sort(people, (int[] a, int[] b)->(b[0]-a[0] == 0 ? a[1]-b[1]:b[0]-a[0]));
        
        ArrayList<int[]> list = new ArrayList<>();
//        for(int i=0; i<people.length; i++)
//        	list.add(new int[0]);
//        System.out.println(list.size());
        
        for(int[] temp : people)   
        		list.add(temp[1], temp);
        
        int[][] arr = new int[people.length][people[0].length];
        int i = 0;
        for(int[] temp : list){
        	arr[i] = temp;
        	i++;
        }
        return arr;
    }
}

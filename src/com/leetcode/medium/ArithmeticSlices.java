package com.leetcode.medium;

public class ArithmeticSlices {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4};
		System.out.println(numberOfArithmeticSlices(arr));
	}
	
    public static int numberOfArithmeticSlices(int[] A) {
        if(A==null || A.length <3)
        	return 0;
        int len = 2;
        int sum = 0;
        for(int i=2; i<A.length; i++){
        	if(A[i]-A[i-1] == A[i-1]-A[i-2]){
        		len++;
        		continue;
        	}
        	if(len>=3){
        		sum += sum(len);
        		len=2;
        	}
        		
        }
     	if(len>=3){
    		sum += sum(len);
    		len=2;
    	}
    	return sum;
    }
    public static int sum(int n){
    	return (n-1)*(n-2)/2;
    }
}

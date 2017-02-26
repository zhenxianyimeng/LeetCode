package com.leetcode.easy;

public class IslandPerimeter {
	public static void main(String[] args) {
		int[][] grid = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
		System.out.println(islandPerimeter(grid));
	}

	public static int islandPerimeter(int[][] grid) {
		int p = 0;
		int m = grid.length;
		int n = grid[0].length;
		int l = 4;
		for(int i=0; i<m;i++)
			for(int j=0; j<n; j++){
				if(grid[i][j] == 1){
					l=4;
					if(i-1 >=0 && grid[i-1][j]==1)
						l--;
					if(i+1 < m && grid[i+1][j]==1)
						l--;
					if(j-1>=0 && grid[i][j-1]==1)
						l--;
					if(j+1<n && grid[i][j+1]==1)
						l--;
					p+=l;
				}
				
			}
		return p;
	}
}

package com.leetcode.medium;

public class BattleshipsInABoard {
	public static void main(String[] args) {
		char[][] board = { { 'X', '.', '.', 'X' }, { '.', '.', '.', 'X' }, { '.', '.', '.', 'X' },
				{ '.', '.', '.', 'X' } };
		System.out.println(countBattleships(board));
		char[][] board1 = {{'X'}};
		System.out.println(countBattleships(board1));
	}

	public static int countBattleships(char[][] board) {
		int iLength = board.length;
		int jLength = board[0].length;
		int sum4 = 0;
		int sum3 = 0;
		for (int i = 0; i < iLength; i++)
			for (int j = 0; j < jLength; j++) {
				if (board[i][j] == 'X') {
					int temp = 0;
					if (i == 0)
						temp++;
					if (i == iLength - 1)
						temp++;
					if (j == 0)
						temp++;
					if (j == jLength - 1)
						temp++;
					if (i-1>=0 &&board[i - 1][j] == '.')
						temp++;
					if (i+1<iLength && board[i + 1][j] == '.')
						temp++;
					if (j-1>=0 && board[i][j - 1] == '.')
						temp++;
					if (j+1<jLength && board[i][j + 1] == '.')
						temp++;

					if (temp == 4)
						sum4++;
					else if (temp == 3)
						sum3++;
				}
			}
		//System.out.println(sum4+":"+sum3);
		return sum4 + sum3 / 2;
	}
}

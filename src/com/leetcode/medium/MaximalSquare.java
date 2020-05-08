package com.leetcode.medium;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-05-08
 * @time: 15:22
 */
public class MaximalSquare {
    public static void main(String[] args) {
        char[][] matrix = {
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}

        };
//        char[][] matrix = {
//                {'1'}
//
//        };
//        char[][] matrix = {
//                {'1', '1', '1', '1'},
//                {'1', '1', '1', '1'},
//                {'1', '1', '1', '1'}
//
//        };
//        char[][] matrix = {
//                {'0','1','1','0','0','1','0','1','0','1'},
//                {'0','0','1','0','1','0','1','0','1','0'},
//                {'1','0','0','0','0','1','0','1','1','0'},
//                {'0','1','1','1','1','1','1','0','1','0'},
//                {'0','0','1','1','1','1','1','1','1','0'},
//                {'1','1','0','1','0','1','1','1','1','0'},
//                {'0','0','0','1','1','0','0','0','1','0'},
//                {'1','1','0','1','1','0','0','1','1','1'},
//                {'0','1','0','1','1','0','1','0','1','1'}
//        };
        System.out.println(new MaximalSquare().maximalSquare(matrix));
    }

    public int maximalSquare(char[][] matrix) {
        if(matrix == null || matrix.length == 0 ||  matrix[0].length == 0){
            return 0;
        }
        int rows = matrix.length;
        int cloums = matrix[0].length;
        int maxSide = 0;
        int len = matrix.length;
        for (int i = 0; i < rows ; i++) {
            for (int j = 0; j < cloums ; j++) {
                if(matrix[i][j] == '0'){
                    continue;
                }
                int leftSide = Math.min(rows-i, cloums - j);
                boolean hasZeroFlag = false;
                maxSide = Math.max(1, maxSide);
                for (int k = 1; k < leftSide; k++) {
                    if(matrix[i+k][j+k] == '0'){
                        break;
                    }
                    for (int l = 0; l <=k ; l++) {
                        if(matrix[i+l][j+k] == '1' && matrix[i+k][j+l] == '1'){
                            if (l + 1 > maxSide){
                                maxSide = l + 1;
                            }
                        }else {
                            hasZeroFlag = true;
                            break;
                        }
                    }
                    if(hasZeroFlag){
                        break;
                    }
                }
            }
        }
        return maxSide * maxSide;
    }
}

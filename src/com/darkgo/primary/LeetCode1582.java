package com.darkgo.primary;

/**
 * <p>
 * 二进制矩阵中的特殊位置
 * </p>
 *
 * @author ShiWu
 * @since 2022/9/4
 */
public class LeetCode1582 {
    private int numSpecial(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int row[] = new int[m];
        int col[] = new int[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==1){
                    row[i]++;
                    col[j]++;
                }
            }
        }
        int res=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j] == 1 && row[i]==1 && col[j]==1){
                    res++;
                }
            }
        }
        return res;
    }
}

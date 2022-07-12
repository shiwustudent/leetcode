package com.darkgo.primary;

/**
 * <p>
 * 奇数值单元格的数目
 * //TODO 补充另外解法
 * </p>
 *
 * @author ShiWu
 * @since 2022/7/12
 */
public class LeetCode1252 {
    private int oddCells(int m, int n, int[][] indices) {
        int ans=0;
        int[][] arr = new int[m][n];
        for(int[] index:indices){
            int r = index[0];
            int c = index[1];
            for(int i=0;i<m;i++){
                arr[i][c]++;
            }
            for(int i=0;i<n;i++){
                arr[r][i]++;
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if((arr[i][j]&1)==1){
                    ans++;
                }
            }
        }
        return ans;
    }
}

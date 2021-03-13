//时间复杂度 ：O(M×N) ： 遍历整个grid 矩阵元素。
//1.二维数组
class Solution {
    public int minPathSum(int[][] grid) {
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(i == 0 && j == 0) continue;
                else if(i == 0)  grid[i][j] = grid[i][j - 1] + grid[i][j];
                else if(j == 0)  grid[i][j] = grid[i - 1][j] + grid[i][j];
                else grid[i][j] = Math.min(grid[i - 1][j], grid[i][j - 1]) + grid[i][j];
            }
        }
        return grid[grid.length - 1][grid[0].length - 1];
    }
}
//2.一维数组
class Solution {
    public int minPathSum(int[][] grid) {
        int len = grid[0].length;
        int[] dp = new int[len];
        dp[0] = grid[0][0];
        for (int i = 1; i < len; i++)
            dp[i]=dp[i-1]+grid[0][i];
        for (int i = 1; i < grid.length; i++) {
            dp[0] = dp[0] + grid[i][0];
            for (int j = 1; j < len; j++)
                dp[j] = Math.min(dp[j-1]+grid[i][j], dp[j]+grid[i][j]);
        }
        return dp[len-1];
    }
}
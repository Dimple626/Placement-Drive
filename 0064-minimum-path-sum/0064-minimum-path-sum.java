
class Solution {
    public int minPathSum(int[][] grid) {
         int n = grid.length;
        int m = grid[0].length;
        int[][] dp=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dp[i][j]=-1;
            }
        }
        return solve(grid, 0, 0,n,m,dp);
    }

    private int solve(int[][] grid, int i, int j,int n,int m,int[][] dp) {

        // If we go out of bounds, return a very large number
        if (i >= n || j >= m) return Integer.MAX_VALUE;

        // If we reach the last cell
        if (i == n - 1 && j == m - 1) return grid[i][j];
        if(dp[i][j]!=-1) return dp[i][j];
        // Move right OR down
        int right = solve(grid, i, j + 1,n,m,dp);
        int down = solve(grid, i + 1, j,n,m,dp);

        
        dp[i][j]= grid[i][j] + Math.min(right, down);
        return dp[i][j];
    }
}

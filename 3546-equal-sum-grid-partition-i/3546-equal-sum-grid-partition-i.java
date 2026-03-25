class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        long sum=0;
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                sum+=grid[i][j];
            }
        }
        //top sum for horizontal cut
        long topsum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                topsum+=grid[i][j];
            }
              if(topsum==sum-topsum) return true;
        }

        //left sum for vertical check
        long leftsum=0;
        for(int j=0;j<m;j++){
            for(int i=0;i<n;i++){
                leftsum+=grid[i][j];
            }
            if(leftsum==sum-leftsum) return true;
        }
        return false;
    }
}
class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int n=grid.length;
        int m=grid[0].length;
       int[][] prefixsum=new int[n][m];
       int cnt=0;
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            prefixsum[i][j]=grid[i][j];
            if(i>0) prefixsum[i][j]+=prefixsum[i-1][j];
            if(j>0) prefixsum[i][j]+=prefixsum[i][j-1];
            if(i>0 && j>0) prefixsum[i][j]-=prefixsum[i-1][j-1];
            if(prefixsum[i][j]<=k){
                cnt++;
            }
        }
       }
      return cnt;
      
       
    }
}
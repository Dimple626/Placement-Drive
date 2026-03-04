class Solution {
    public int numSpecial(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==1 && nocolumn(mat,i,j) && norow(mat,i,j)){
                    cnt++;
                }
            }
        }
        return cnt;
    }
    private boolean nocolumn(int[][] mat,int i,int j){
     for(int k=0;k<mat[0].length;k++){
        if(k!=j){
            if(mat[i][k]==1) return false;
        }
     }
     return true;
      
    }
    private boolean norow(int[][] mat,int i,int j){
       for(int k=0;k<mat.length;k++){
        if(k!=i){
            if(mat[k][j]==1) return false;
        }
     }
     return true;
      
    }
}
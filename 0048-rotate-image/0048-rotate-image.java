class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int[][] temp=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                temp[i][j]=matrix[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=temp[j][i];
            }
        }
        for(int i=0;i<n;i++){
            int right=m-1;
            int left=0;
            while(left<right){
                int val=matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=val;
                left++;
                right--;
            }
        }
    }
}
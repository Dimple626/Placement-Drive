class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int n=arr.length;
        int m=arr[0].length;
        int left=0;
        int right=n*m-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            int row=mid/m;
            int col=mid%m;
            if(arr[row][col]==target){
                return true;
            }else if(arr[row][col]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
      return false;
    }
}
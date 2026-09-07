class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n=matrix.length;
        int[] arr=new int[n*n];
        int i=0;
        for(int rows[]:matrix){
            for(int num:rows){
                arr[i++]=num;
            }
        }
        Arrays.sort(arr);
        return arr[k-1];
    }
}
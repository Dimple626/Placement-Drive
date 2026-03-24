class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        int[] res=new int[n];
        int maxfromright=arr[n-1];
        res[n-1]=-1;
        for(int i=n-2;i>=0;i--){
          res[i]=maxfromright;
          if(arr[i]>maxfromright){
            maxfromright=arr[i];
          }
          
        }
        return res;
    }
}
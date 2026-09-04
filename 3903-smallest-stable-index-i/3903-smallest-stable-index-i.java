class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int instable=Integer.MAX_VALUE;
        int n=nums.length;
        int[] prefixmax=new int[n];
        int[] suffixmin=new int[n];
        prefixmax[0]=nums[0];
        suffixmin[n-1]=nums[n-1];
        for(int i=1;i<n;i++){
            prefixmax[i]=Math.max(prefixmax[i-1],nums[i]);
            suffixmin[n-i-1]=Math.min(suffixmin[n-i],nums[n-i-1]);
        }
        for(int i=0;i<n;i++){
            int diff= prefixmax[i]-suffixmin[i];
            if(diff<=k){
                return i;
            }
          
        }
     
     return -1;
      
    }
}
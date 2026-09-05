class Solution {
    public int firstStableIndex(int[] nums, int k) {
         int n=nums.length;
        int[] suffix=new int[n];
        int[] prefix=new int[n];
        prefix[0]=nums[0];
        suffix[n-1]=nums[n-1];
        for(int i=1;i<n;i++){
            prefix[i]=Math.max(prefix[i-1],nums[i]);
            suffix[n-i-1]=Math.min(suffix[n-i],nums[n-i-1]);
        }
        for(int i=0;i<nums.length;i++){
          if(prefix[i]-suffix[i]<=k){
              return i;
          }
        }
        return -1;
        
    }
}
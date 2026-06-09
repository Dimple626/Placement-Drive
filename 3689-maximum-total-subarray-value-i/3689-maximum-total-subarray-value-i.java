class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long sum=0;
        int maxi=Integer.MIN_VALUE;
        int mini=Integer.MAX_VALUE;
        for(int num:nums){
            maxi=Math.max(maxi,num);
            mini=Math.min(mini,num);
        }
        return (long)(maxi - mini) * k;
      
    }
}
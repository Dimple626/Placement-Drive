class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];
        Arrays.fill(dp,1);
        int maxlen=1;
        for(int i=1;i<n;i++){
            for(int p=0;p<i;p++){
                if(nums[i]>nums[p]){
                    dp[i]=Math.max(dp[i],1+dp[p]);
                }
            }
            maxlen=Math.max(maxlen,dp[i]);
        }
        return maxlen;
    }
}
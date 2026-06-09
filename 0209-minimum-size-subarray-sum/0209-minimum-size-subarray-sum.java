class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int mini=Integer.MAX_VALUE;
        int left=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum>target){
                mini=Math.min(mini,i-left+1);
                sum-=nums[left];
                left++;
            }
             if(sum==target){
                mini=Math.min(mini,i-left+1);
            }
        }
        return mini==Integer.MAX_VALUE?0:mini;
    }
}
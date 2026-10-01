class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        int left=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int maxi=Integer.MIN_VALUE;
        maxi=Math.max(sum,maxi);
        for(int i=k;i<nums.length;i++){
            sum+=nums[i];
            sum-=nums[left];
            maxi=Math.max(sum,maxi);
            left++;
        }
        return (double)maxi/k;
    }
}
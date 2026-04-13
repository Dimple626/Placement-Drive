class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int maxi=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                maxi=Math.min(maxi, Math.abs(start-i));
            }
        }
        return maxi;
    }
}
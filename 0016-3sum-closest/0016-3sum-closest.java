class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closetsum=nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length-2;i++){
             int left=i+1,right=nums.length-1;
             while(left<right){
            int currentsum=nums[i]+nums[left]+nums[right];
            if(currentsum==target){
                return currentsum;
            }
            if(Math.abs(currentsum-target)<Math.abs(closetsum-target)){
                closetsum=currentsum;
            }
            if(currentsum<target){
                left++;
            }else{
                right--;
            }
        }
        }
        return closetsum;
    }
}
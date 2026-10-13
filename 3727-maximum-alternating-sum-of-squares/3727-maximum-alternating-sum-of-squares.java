class Solution {
    public long maxAlternatingSum(int[] nums) {
        long sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                nums[i]=-nums[i];
            }
        }
        Arrays.sort(nums);
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            if(left==right) {
                sum+=nums[left]*nums[left]; 
                return sum;
            }
            sum+=nums[right]*nums[right];
            sum-=nums[left]*nums[left];
            left++;
            right--;
        }
        return sum;
    }
}

class Solution {
    public int searchInsert(int[] nums, int target) {
        int left=0;
        int right=nums.length;
        int mid=(left+right)/2;
        while(left<right){  
            if(nums[mid]==target){
                return mid;
            }
            if(target>nums[mid]){
                left=mid+1;
                mid=(left+right)/2;
            }else{
                right=mid;
                mid=(left+right)/2;
            }
        }
        return left;
    }
}
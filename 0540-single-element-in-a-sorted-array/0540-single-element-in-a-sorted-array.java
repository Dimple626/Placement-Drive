class Solution {
    public int singleNonDuplicate(int[] nums) {
       int left=0;
        int right=nums.length-1;
        int n=nums.length;
        while(left<right){
            int mid=left+(right-left)/2;
            if(mid < n-1 &&  nums[mid]==nums[mid+1]){
                    if((n-mid)%2==1){
                        left=mid+1;
                    }else{
                        right=mid-1;
                    }
            }else if (mid > 0 && nums[mid]==nums[mid-1]){
                if((n-mid)%2==1){
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }else{
                return nums[mid];
            }
        }
        return nums[left];
    }
}
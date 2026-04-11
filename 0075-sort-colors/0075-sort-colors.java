class Solution {
    public void sortColors(int[] nums) {
        int start=0;
        int n=nums.length;
        int high=n-1;
        int mid=0;
        while(mid<=high){
            if(nums[mid]==1){
                mid++;
            }else if(nums[mid]==0){
                nums[mid]=nums[start];
                nums[start]=0;
                start++;
                mid++;
            }else{
                nums[mid]=nums[high];
                nums[high]=2;
                high--;
            }
        }
      
      
    }
}
class Solution {
    public int reversePairs(int[] nums) {
        return mergesort(nums,0,nums.length-1);
    }
    private int mergesort(int[] nums,int left,int right){
        if(left>=right) return 0;
        int mid=(left+right)/2;
        int j=mid+1;
        int count=0;
        count += mergesort(nums, left, mid);
        count += mergesort(nums, mid + 1, right);
        for(int i=left;i<=mid;i++){
            while(j<=right && (long)nums[i]>nums[j]*2L){
                j++;
            }
            count += j - (mid + 1);
        }
        merge(nums,left,mid,right);
        return count;
    }
    private void merge(int[] nums,int  left,int mid,int right){
        int[] temp=new int[right-left+1];
        int i=left,j=mid+1,k=0;
        while(i<=mid&&j<=right){
            if(nums[i]>nums[j]) temp[k++]=nums[j++];
            else temp[k++]=nums[i++];
        }
        while(i<=mid) temp[k++]=nums[i++];
        while(j<=right) temp[k++]=nums[j++];
        for (int p = 0; p < temp.length; p++) {
        nums[left + p] = temp[p];
    }
    }
}
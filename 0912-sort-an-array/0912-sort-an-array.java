class Solution {
    public int[] sortArray(int[] nums) {
        return mergesort(nums,0,nums.length-1);
    }
    private int[] mergesort(int[] nums,int start,int  end){
        if(start<end){
            int mid=start+(end-start)/2;
            mergesort(nums,start,mid);
            mergesort(nums,mid+1,end);
            merge(nums,start,mid,end);
        }
        return nums;
    }
    private int[]  merge(int[] nums,int left,int mid,int end){
        int[] result=new int[end-left+1];
        int i=left;
        int j=mid+1;
        int k=0;
        while(i<=mid&& j<=end){
            if(nums[i]>=nums[j]){
                result[k++]=nums[j++];
            }else{
                result[k++]=nums[i++];
            }
        }
        while(i<=mid){
            result[k++]=nums[i++];
        }
        while(j<=end){
            result[k++]=nums[j++];
        }
        for(int p=0;p<end-left+1;p++){
            nums[left+p]=result[p];
        }
        return nums;
    }
}
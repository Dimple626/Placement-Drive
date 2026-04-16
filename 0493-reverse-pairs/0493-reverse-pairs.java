class Solution {
    public int reversePairs(int[] nums) {
        return mergesort(nums,0,nums.length-1);
    }
    private int mergesort(int[] nums,int left,int right){
        int cnt=0;
        if(left>=right) return 0;
        int mid=left+(right-left)/2;
        cnt+=mergesort(nums,left,mid);
        cnt+=mergesort(nums,mid+1,right);
        cnt+=countpairs(nums,left,mid,right);
        merge(nums,left,mid,right);
        return cnt;
    }
    private int countpairs(int[] nums,int left,int mid,int right){
        int count=0;
        int j=mid+1;
        for(int i=left;i<=mid;i++){
            while(j<=right && nums[i]>2L*nums[j]){
                j++;
            }
             count+=(j-(mid+1));
        }
        return count;
    }
    private void merge(int[] nums,int left,int mid,int right){
        int[] result=new int[right-left+1];
        int i=left;
        int j=mid+1;
        int k=0;
        int count=0;
        while(i<=mid && j<=right){
            if(nums[i]<nums[j]){
                result[k++]=nums[i++];
            }else{
                result[k++]=nums[j++];
            }
        }
        while(i<=mid){
            result[k++]=nums[i++];
        }
        while(j<=right){
            result[k++]=nums[j++];
        }
        for(int p=0;p<right-left+1;p++){
            nums[left+p]=result[p];
        }
    }
}
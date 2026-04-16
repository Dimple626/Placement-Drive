class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int index=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }
        if(index!=-1){
            for(int i=n-1;i>=index;i--){
                if(nums[i]>nums[index]){
                    swap(nums,index,i);
                    break;
                }
            }
        }
reverse(nums,index+1,n-1);
    }
    private void swap(int[] arr,int index,int i){
        int temp=arr[index];
        arr[index]=arr[i];
        arr[i]=temp;
    }
    private void reverse(int[]  arr,int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
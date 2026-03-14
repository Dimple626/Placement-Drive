class Solution {
    public int singleNonDuplicate(int[] arr) {
       int left=0;
       int right=arr.length-2;
       while(left<=right){
        int mid=left+(right-left)/2;
        if(arr[mid]==arr[mid^1]){
            left=mid+1;
        }else{
            right=mid-1;
        }
       }
       return arr[left];
    }
}
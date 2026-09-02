class Solution {
    public boolean uniformArray(int[] nums1) {
        int n=nums1.length;
       int odd=0;
       for(int num:nums1){
        if(num%2==1){
            odd++;
        }
       }
       if(odd==0){
        return true;
       }else if(odd==1){
        return true;
       }else if(odd>=2){
        return true;
       }
       
       
      return false;
    }
}
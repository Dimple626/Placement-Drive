class Solution {
    public int maxProfit(int[] nums) {
        int maxprice=Integer.MIN_VALUE;
        int minprice=nums[0];
        for(int num:nums){
            if(minprice>num){
                minprice=num;
            }else{
                int maxi=num-minprice;
                maxprice=Math.max(maxi,maxprice);
            }
        }
        return maxprice;
    }
}
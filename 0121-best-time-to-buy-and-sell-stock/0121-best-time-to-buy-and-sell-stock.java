class Solution {
    public int maxProfit(int[] prices) {
        int mini=Integer.MAX_VALUE;
        int maxi=0;
        for(int price:prices){
            mini=Math.min(mini,price);
            if(mini<price){
                maxi=Math.max(maxi,price-mini);
            }
        }
        return maxi;
    }
}
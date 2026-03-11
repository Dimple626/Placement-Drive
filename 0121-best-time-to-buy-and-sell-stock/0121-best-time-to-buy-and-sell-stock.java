class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int minprice=Integer.MAX_VALUE;
        for(int price:prices){
            if(price<minprice){
                minprice=price;
            }else{
                profit=Math.max(profit,price-minprice);
            }
        }
        return profit;
    }
}
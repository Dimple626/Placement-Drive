class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int cnt=0;
        for(int i=0;i<tickets.length;i++){
            if(i<=k){
            cnt+=Math.min(tickets[k],tickets[i]);
        }else{
            cnt+=Math.min(tickets[k]-1,tickets[i]);
        }}
        return cnt;
    }
}
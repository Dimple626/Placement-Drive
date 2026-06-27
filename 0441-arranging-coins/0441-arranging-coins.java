class Solution {
    public int arrangeCoins(int n) {
        if(n==1) return 1;
        int cnt=0;
        for(int i=1;i<=n;i++){
            if(i>n) break;
            n=n-i;
            cnt++;
        }
        return cnt;
    }
}
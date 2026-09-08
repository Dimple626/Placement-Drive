class Solution {
    public int countCommas(int n) {
       int cdigit=0;
       int temp=n;
       while(n>0){
        n=n/10;
        cdigit++;
       }
       if(cdigit<=3) return 0;
       return temp-999;
       
    }
}
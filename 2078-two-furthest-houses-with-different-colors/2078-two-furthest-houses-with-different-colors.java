class Solution {
    public int maxDistance(int[] color) {
        int n=color.length;
        int maxlen=0;
        for(int i=0;i<n;i++){
            if(color[0]!=color[i]){
                maxlen=Math.max(maxlen,i);
            }
            if(color[n-1]!=color[i]){
                maxlen=Math.max(maxlen,n-1-i);
            }
        }
        return maxlen;
    }
}
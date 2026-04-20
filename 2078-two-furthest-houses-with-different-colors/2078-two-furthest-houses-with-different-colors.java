class Solution {
    public int maxDistance(int[] color) {
        int n=color.length;
        int left=0;
        int right=n-1;
        int maxlen=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(color[i]==color[j]) continue;
                if(maxlen<j-i){
                    maxlen=j-i;
                }
            }
        }
      
        return maxlen;
    }

}
class Solution {
    public int longestOnes(int[] arr, int k) {
       int left=0;
       int cntzero=0;
       int maxlen=0;
       for(int right=0;right<arr.length;right++){
        if(arr[right]==0)cntzero++;
        while(cntzero>k){
            if(arr[left]==0) cntzero--;
            left++;
        }
        maxlen=Math.max(maxlen,right-left+1);
       }
       return maxlen;
    }
}
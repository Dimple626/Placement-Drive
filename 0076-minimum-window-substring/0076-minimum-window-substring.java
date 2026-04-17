class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()) return "";
        int start=0;
        int right=0;
        int left=0;
        int[] freq=new int[128];
       for(char ch:t.toCharArray()){
        freq[ch]++;
       }
       int minlen=Integer.MAX_VALUE;
       int required=t.length();
        while(right<s.length()){
            freq[s.charAt(right)]--;
            if(freq[s.charAt(right)]>=0){
                required--;
            }
            while(required==0){
                if(minlen>right-left+1){
                    minlen=right-left+1;
                    start=left;
                }
                char ch=s.charAt(left);
                freq[ch]++;
                if(freq[ch]>0){
                    required++;
                }
                left++;
            }
            right++;
        }
        return minlen==Integer.MAX_VALUE?"":s.substring(start,start+minlen);
    }
}
class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()) return "";
        int[] freq=new int[128];
        int right=0;
        int start=0;
        int left=0;
        int minlen=Integer.MAX_VALUE;
        int required=t.length();
        for(char ch:t.toCharArray()){
            freq[ch]++;
        }
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
            char l=s.charAt(left);
            freq[l]++;
            if(freq[l]>0){
                required++;
            }
            left++;
            }
            right++;
        }
        return minlen==Integer.MAX_VALUE?"":s.substring(start,start+minlen);
    }
}
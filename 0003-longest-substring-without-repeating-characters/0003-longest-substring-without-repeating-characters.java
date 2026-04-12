class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        if(s.length()==0) return 0;
        int cnt=0;
        int left=0;
        int maxlen=1;
        for(int i=0;i<s.length();i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(left));
                left++;
                cnt--;
            }
            set.add(s.charAt(i));
            cnt++;
            maxlen=Math.max(maxlen,cnt);
        }
        return maxlen;
    }
}
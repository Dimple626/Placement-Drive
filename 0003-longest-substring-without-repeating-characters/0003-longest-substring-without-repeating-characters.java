class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        if(n==0||n==1) return n;
        int left=0;
        int maxlength=0;
        HashSet<Character> set=new HashSet<>();
        for(int right=0;right<n;right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxlength=Math.max(maxlength,right-left+1);
        }
        return maxlength;
    }
}
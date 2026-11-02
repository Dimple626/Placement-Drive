class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        if(n<=1) return n;
        int maxi=1;
        int left=0;
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            while(set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
            }
            maxi=Math.max(maxi,i-left+1);
            set.add(ch);
        }
        return maxi;
    }
}
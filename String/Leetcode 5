class Solution {
    public boolean isPalindrome(String s,int left,int right) {
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public String longestPalindrome(String s){
        int max=1;int start=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+max;j<s.length();j++){
                if(isPalindrome(s,i,j)&&j-i+1>max){
                    max=j-i+1;
                    start=i;
                }
            }
        }
        return s.substring(start,start+max);
    }
}

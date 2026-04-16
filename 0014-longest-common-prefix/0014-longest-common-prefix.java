class Solution {
    // brute force approach 
    public String longestCommonPrefix(String[] strs) {
        String result="";
        for(int i=0;i<strs[0].length();i++){
            char ch=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(i>=strs[j].length() || strs[j].charAt(i)!=ch){
                    return result;
                }
            }
            result+=ch;
        }
        return result;
    }
}
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        int[] counts=new int[26];
        for(int i=0;i<s1.length();i++){
            counts[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<=m-n;i++){
              int[] count=new int[26];
            for(int j=i;j<i+n;j++){
            count[s2.charAt(j)-'a']++;
            }
            if(Arrays.equals(count,counts)) return true;
        }
        return false;
    }
}
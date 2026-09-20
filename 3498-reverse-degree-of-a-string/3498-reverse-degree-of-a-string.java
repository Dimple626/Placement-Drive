class Solution {
    public int reverseDegree(String s) {
        
        int reverse=0;
        for(int i=0;i<s.length();i++){
            int k=i+1;
            reverse+=k*('z'-(int)s.charAt(i)+1);

        }
        return reverse;
    }
}
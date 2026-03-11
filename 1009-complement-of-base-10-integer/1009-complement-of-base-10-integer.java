class Solution {
    public int bitwiseComplement(int n) {
        String ans=Integer.toBinaryString(n);
        StringBuilder s=new StringBuilder(ans);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                s.setCharAt(i,'1');
            }else {
                s.setCharAt(i,'0');
            }
        }
        return Integer.parseInt(s.toString(), 2);
    }
}
class Solution {
    public int minOperations(String s) {
        return Math.min(countOne(s),countZero(s));

    }
    public int countOne(String s){
        boolean one=true;
        int count=0;
        for(char ch:s.toCharArray()){
            if(one){
                if(ch!='1'){
                    count++;
                }
                one=!one;
            }else{
                if(ch!='0') count++;
                one=!one;
            }
        }
        return count;
    }
    public int countZero(String s){
        boolean zero=true;
        int count=0;
        for(char ch:s.toCharArray()){
            if(zero){
                if(ch!='0'){
                    count++;
                }
                zero=!zero;
            }else{
                if(ch!='1') count++;
                zero=!zero;
            }
        }
        return count;
    }
}
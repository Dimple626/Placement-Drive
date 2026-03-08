class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n=nums[0].length();
        HashSet<String> set=new HashSet<>();
        for(String s:nums){
            set.add(s);
        }
        for(int i=0;i<2*n;i++){
            String str=Integer.toBinaryString(i);
            int temp=str.length();
            for(int j=0;j<n-temp;j++){
                str=str+'0';
            }
           if(!set.contains(str)){
            return str;
           }
        }
        return "";
    }
}
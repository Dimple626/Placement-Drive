class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> ans=new ArrayList<>();
        int num=1<<n;
        for(int i=0;i<num;i++){
            int res=i^(i>>1);
            ans.add(res);
        }
        return ans;
    }
}
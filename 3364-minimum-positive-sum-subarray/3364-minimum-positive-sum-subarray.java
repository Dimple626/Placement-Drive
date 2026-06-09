class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n=nums.size();
        int mini=Integer.MAX_VALUE;
        for(int start=0;start<n;start++){
            int sum=0;
            for(int end=start;end<n;end++){
                sum+=nums.get(end);
                int size=end-start+1;
                if(sum>0 && size>=l && size<=r){
                    mini=Math.min(mini,sum);
                }
                if(size>r){
                    break;
                }
            }
        }
        return mini==Integer.MAX_VALUE?-1:mini;
    }
}
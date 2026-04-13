class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int[] prefixsum=prefix(height);
        int[] suffixsum=suffix(height);
        int sum=0;
        for(int i=1;i<n;i++){
            sum+=Math.min(prefixsum[i],suffixsum[i])-height[i];
        }
        return sum;
        
    }
    private int[] prefix(int[] nums){
        int n=nums.length;
        int[] prefix=new int[n];
        prefix[0]=nums[0];
        for(int i=1;i<n;i++){
            prefix[i]=Math.max(prefix[i-1],nums[i]);
        }
        return prefix;
    }
    private int[] suffix(int[] nums){
        int n=nums.length;
        int[] suffix=new int[n];
        suffix[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            suffix[i]=Math.max(suffix[i+1],nums[i]);
        }
        return suffix;
    }
}
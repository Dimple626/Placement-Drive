class Solution {
    public int minLength(int[] nums, int k) {
        int left=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int mini=Integer.MAX_VALUE;
        for(int right=0;right<nums.length;right++){
            if(!map.containsKey(nums[right])){
                sum+=nums[right];
            }
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            while(sum>=k){
                mini=Math.min(mini,right-left+1);
                map.put(nums[left],map.getOrDefault(nums[left],0)-1);
                int leftnum=nums[left];
                if(map.get(leftnum)==0){
                    sum-=nums[left];
                    map.remove(nums[left]);
                }
                left++;
            }
        }
        return mini==Integer.MAX_VALUE?-1:mini;
    }
}
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> comb=new ArrayList<>();
       generatecomb(0,candidates,new ArrayList(),comb,target);
       return comb;
       
    }
    void generatecomb(int start,int[] nums,List<Integer> current,List<List<Integer>> comb,int target){
        if(target==0){
            comb.add(new ArrayList(current));
            return;
        }
        if(target<0){
            return;
        }
        for(int i=start;i<nums.length;i++){
            if(i>start && nums[i]==nums[i-1]) continue;
             if (nums[i] > target) break;
            current.add(nums[i]);
            generatecomb(i+1,nums,current,comb,target-nums[i]);
            current.remove(current.size()-1);
        }
    }
}
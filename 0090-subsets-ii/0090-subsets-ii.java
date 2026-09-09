class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
     List<List<Integer>> subset=new ArrayList<>();
     Arrays.sort(nums);
     backtrack(0,subset,nums,new ArrayList<>());
     return subset;
        
    }
    public void backtrack(int start, List<List<Integer>> subset,int[] nums,ArrayList<Integer> list){
        subset.add(new ArrayList<>(list));
        for(int i=start;i<nums.length;i++){
            if(i>start && nums[i]==nums[i-1]) continue;
            list.add(nums[i]);
            backtrack(i+1,subset,nums,list);
            list.remove(list.size()-1);
        }
    }
}
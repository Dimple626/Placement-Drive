class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new  ArrayList<>();
        generatecomb(0,candidates,target,result,new ArrayList<>());
        return result;
    }
    private void generatecomb(int idx,int[] candidates,int target,List<List<Integer>> result,List<Integer> current){
        if(target==0){
            result.add(new ArrayList<>(current));
            return;
        }
        if(target<0 || idx >= candidates.length){
            return;
        }
        current.add(candidates[idx]);
         generatecomb(idx,candidates,target-candidates[idx],result,current);
        current.remove(current.size()-1);
         generatecomb(idx+1,candidates,target,result,current);
    }
}
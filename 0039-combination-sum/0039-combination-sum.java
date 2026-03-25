class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        generatecomb(0,candidates,target,res,new ArrayList<>());
        return res;
    }
    private void generatecomb(int start,int[] candidates,int target,List<List<Integer>> res,
        ArrayList<Integer> current){
        if(target==0){
            res.add(new ArrayList<>(current));
        }
        if(target<0){
            return;
        }
        for(int i=start;i<candidates.length;i++){
         current.add(candidates[i]);
           generatecomb(i,candidates,target-candidates[i],res,current);
           current.remove(current.size()-1);
        }
    }
}
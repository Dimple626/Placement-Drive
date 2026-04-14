class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
           List<List<Integer>> result=new  ArrayList<>();
        generatecomb(0,candidates,target,result,new ArrayList<>());
        return result;
    }
    private void generatecomb(int idx,int[] candidates,int target,List<List<Integer>> result,List<Integer> current){
        if(target==0){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i=idx;i<candidates.length;i++){
            if(i>idx && candidates[i]==candidates[i-1]) continue;
            if(candidates[i]>target){
                break;
            }
            current.add(candidates[i]);
            generatecomb(i+1,candidates,target-candidates[i],result,current);
            current.remove(current.size()-1);
        }
     
     
    }
}
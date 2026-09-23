class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result=new ArrayList<>();
        int maxcandie=0;
        for(int num:candies){
            maxcandie=Math.max(maxcandie,num);
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=maxcandie){
                result.add(true);
            }else{
            result.add(false);
            }
        }
        return result;
    }
}

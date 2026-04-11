class Solution {
    public int minimumDistance(int[] nums) {
        Map<Integer,ArrayList<Integer>> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.putIfAbsent(nums[i],new ArrayList<>());
            map.get(nums[i]).add(i);
        }
        int mindist=Integer.MAX_VALUE;
         for(List<Integer> list:map.values()){
            if(list.size()<3) continue;
            for(int i=0;i<=list.size()-3;i++){
            int start=list.get(i);
            int end=list.get(i+2);
            int dist=2*(end-start);
            mindist=Math.min(dist,mindist);
              }
        }
        return mindist==Integer.MAX_VALUE?-1:mindist;
    }
}
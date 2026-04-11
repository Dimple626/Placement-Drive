class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
      HashSet<Integer> set=new HashSet<>();
      int n=grid.length;
      int N=n*n;
      int actualsum=N*(N+1)/2;
      int sum=0;
      int repeat=0;
      for(int[] rows:grid){
        for(int num:rows){
            if(set.contains(num)){
                repeat=num;
            }
            set.add(num);
            sum+=num;
        }
      }
      int missing=actualsum-(sum-repeat);
    return new int[]{repeat,missing};  
    }
}
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> list=new ArrayList<>();
        int i=0;
        int n=intervals.length;
        while(i<n && newInterval[0]>intervals[i][1]){
            list.add(intervals[i]);
            i++;
        }
          while(i<n && newInterval[1]>=intervals[i][0]){
           newInterval[0]=Math.min(newInterval[0],intervals[i][0]);
            newInterval[1]=Math.max(newInterval[1],intervals[i][1]);
            i++;
        }
        list.add(newInterval);
         while(i<n){
            list.add(intervals[i]);
            i++;
        }
        return list.toArray(new int[list.size()][2]);
    }
}

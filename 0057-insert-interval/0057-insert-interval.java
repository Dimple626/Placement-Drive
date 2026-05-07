class Solution {
    public int[][] insert(int[][] intervals, int[] newinterval) {
        int[][] result=new int[intervals.length+1][2];
        int i=0,j=0;
        while(i<intervals.length && intervals[i][1]<newinterval[0]){
            result[j++]=intervals[i++];
        }
        while(i<intervals.length && intervals[i][0]<=newinterval[1]){
            newinterval[0]=Math.min(newinterval[0],intervals[i][0]);
            newinterval[1]=Math.max(newinterval[1],intervals[i++][1]);
        }
        result[j++]=newinterval;
        while(i<intervals.length){
            result[j++]=intervals[i++];
        }
        return java.util.Arrays.copyOf(result,j);
    }
}
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalgas=0;
        int totalcost=0;
        for(int num:gas){
            totalgas+=num;
        }
        for(int num:cost){
            totalcost+=num;
        }
        int n=gas.length;
        if(totalgas<totalcost) return -1;
        int startindex=0;
        int i=0;
        int required=0;
        while(i<n){
             required+=gas[i]-cost[i];
            if(required<0){
                required=0;
                startindex=i+1;
            }
            i++;
        }
        return startindex;
    }
}

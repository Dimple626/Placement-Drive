class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        ArrayList<ArrayList<int[]>> graph=new ArrayList<>();
        for(int i=0;i<=n;i++){
            graph.add(new ArrayList<>());
        }
        for(int[] t:times){
            int u=t[0];
            int v=t[1];
            int w=t[2];
            graph.get(u).add(new int[]{v,w});
        }
        int[] dist=new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[k]=0;
      PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> a[0] - b[0]);
      q.add(new int[]{0, k});
      while(q.size()!=0){
        int[] curr = q.poll();
        int time = curr[0];
        int node = curr[1];
        for(int i=0;i<graph.get(node).size();i++){
         int edgeweight = graph.get(node).get(i)[1];
        int adjnode = graph.get(node).get(i)[0];
            if(time+edgeweight<dist[adjnode]){
                dist[adjnode]=time+edgeweight;
                q.add(new int[]{dist[adjnode],adjnode});
            }
        }
      }
    int sum=0;
    for(int i=1;i<=n;i++){
        if(dist[i]==Integer.MAX_VALUE) return -1;
        sum=Math.max(sum,dist[i]);
    }
return sum;
    }
}
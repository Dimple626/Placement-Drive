class Pair{
    int row;
    int col;
    int tm;
    public Pair(int row,int col,int tm){
        this.row=row;
        this.col=col;
        this.tm=tm;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] visited=new int[n][m];
        Queue<Pair> q=new LinkedList<>();
        int cntfresh=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new Pair(i,j,0));
                    visited[i][j]=2;
                }
                if(grid[i][j]==1) cntfresh++;
            }
        }
        int tmm=0;
        int[] drow={-1,0,1,0};
        int[] dcol={0,1,0,-1};
        int cnt=0;
        while(!q.isEmpty()){
            int r=q.peek().row;
            int c=q.peek().col;
            int t=q.peek().tm;
            tmm=Math.max(tmm,t);
            q.remove();
            for(int i=0;i<4;i++){
                int nrow=r+drow[i];
                int ncol=c+dcol[i];
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && grid[nrow][ncol]==1 && visited[nrow][ncol]==0){
                    visited[nrow][ncol]=2;
                    cnt++;
                    q.add(new Pair(nrow,ncol,t+1));
                }
            }
        }
        if(cnt!=cntfresh) return -1;
        return tmm;
    }
}
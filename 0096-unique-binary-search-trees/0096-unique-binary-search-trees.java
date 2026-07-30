
class Solution {
    public int numTrees(int n) {
        long res=1;
        for(int i=0;i<n;++i){
            res=res*(2*n-i)/(i+1);
        }
        return (int)(res/(n+1));
    }
}
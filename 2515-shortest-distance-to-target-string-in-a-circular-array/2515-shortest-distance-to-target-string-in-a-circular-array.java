class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        if(words[startIndex].equals(target)) return 0;
        int n=words.length;
        int mindist=Integer.MAX_VALUE;
        for(int i=0;i<words.length;i++){
            if(words[i].equals(target)){
                int dist=Math.abs(startIndex-i);
                dist=Math.min(dist,n-dist);
                mindist=Math.min(dist,mindist);
            }
        }
        return mindist==Integer.MAX_VALUE?-1:mindist;
    }
}
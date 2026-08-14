class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int start=0;
        int n=s.length();
        int max=0;
        for(int i=0;i<n;i++){
            while(map.getOrDefault(s.charAt(i),0)>=2){
                map.put(s.charAt(start),map.get(s.charAt(start))-1);
                start++;
            }
            max = Math.max(max, i - start + 1);
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        return max;
    }
}
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> result=new ArrayList<>();
        HashMap<String,Integer> map=new HashMap<>();
        int n=s.length();
        for(int start=0;start<=n-10;start++){
            String sb="";
            for(int end=start;end<n;end++){
                sb=sb+s.charAt(end);
                if(sb.length()==10) break;
            }
           map.put(sb, map.getOrDefault(sb, 0) + 1);  
        }
        for(String key:map.keySet()){
            if(map.get(key)>1){
                result.add(key);
            }
        }
        return result;
    }
}
class Solution {
String[] map = {
    "a",
    "b",
    "c"
};
    public String getHappyString(int n, int k) {
        ArrayList<String> list=new ArrayList<>();
        backtrack(n,list,"");
        if(k > list.size()) return "";
        return list.get(k - 1);
    }
    private void backtrack(int n,ArrayList<String> list,String current){
        if(current.length()==n){
            list.add(current);
            return;
        }
        for(int i=0;i<map.length;i++){
            if(current.length() > 0 && current.charAt(current.length()-1) == map[i].charAt(0)){
                continue;
            }
            backtrack(n,list,current+map[i]); 
        }
    }
}
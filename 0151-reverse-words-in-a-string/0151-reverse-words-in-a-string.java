class Solution {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
        s=s.trim();
        String[] arr=s.split("\\s+");
        int n=s.length();
        for(int i=arr.length-1;i>=0;i--){
            sb.append(arr[i]);
            if(i!=0) sb.append(" ");
        }
        return sb.toString();
    }
}
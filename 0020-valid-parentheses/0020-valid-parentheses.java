class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        if(n%2!=0) return false;
       Stack<Character> st=new Stack<>();
       for(char ch:s.toCharArray()){
        if(ch=='('){
            st.push(')');
        }else if(ch=='{'){
            st.push('}');
        }else if(ch=='['){
            st.push(']');
        }else 
        {
            if(st.isEmpty()||ch!=st.pop()){
            return false;
        }
       }
       } 
       return st.isEmpty();
    }
}

class Solution {
    public int largestRectangleArea(int[] arr) {
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        int maxarea=0;
       for(int i=0;i<n;i++){
        while(!st.isEmpty()&&arr[st.peek()]>arr[i]){
            int element=st.pop();
            int nse=i;
            int pse=st.isEmpty()?-1:st.peek();
            int area=arr[element]*(nse-pse-1);
            maxarea=Math.max(maxarea,area);
        }
        st.push(i);
       }
       while(!st.isEmpty()){
          int element=st.pop();
            int nse=n;
            int pse=st.isEmpty()?-1:st.peek();
            int area=arr[element]*(nse-pse-1);
            maxarea=Math.max(maxarea,area);
       }
       return maxarea;
    }
}
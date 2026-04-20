class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int[] res=new int[n];
        int[] copy = nums2.clone();
        Stack<Integer> st=new Stack<>();
        int m=nums2.length;
        for(int i=m-1;i>=0;i--){
            while(!st.isEmpty() && nums2[i]>st.peek()){
                st.pop();
            }
            
        nums2[i]=st.isEmpty()?-1:st.peek();
            
            st.push(copy[i]);
        }
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(nums1[i]==copy[j]){
                res[i]=nums2[j];
            }
        }
    }
        return res;
    }
}
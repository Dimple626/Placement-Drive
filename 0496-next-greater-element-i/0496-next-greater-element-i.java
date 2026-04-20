class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums1.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        Stack<Integer> st=new Stack<>();
        for(int i=nums2.length-1;i>=0;i--){
            while(!st.isEmpty() && nums2[i]>st.peek()){
                st.pop();
            }
            map.put(nums2[i],st.isEmpty()?-1:st.peek());
            st.push(nums2[i]);
        }
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            res[i]=map.get(nums1[i]);
        }
        return res;
    }
}
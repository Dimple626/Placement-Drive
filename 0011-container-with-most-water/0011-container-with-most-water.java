class Solution {
    public int maxArea(int[] height) {
        int maxi=0;
        int left=0;
        int right=height.length-1;
        while(left<right){
            int mini=Math.min(height[left],height[right]);
            int width=right-left;
            maxi=Math.max(maxi,mini*width);
            if(height[left]>height[right]){
                right--;
            }else{
                left++;
            }
        }
       
        return maxi;
    }
}
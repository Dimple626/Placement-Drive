class Solution {
    public int maxArea(int[] height) {
      int left=0;
      int right=height.length-1;
      int maxarea=0;
      while(left<right){
        int width=right-left;
        int h=Math.min(height[left],height[right]);
        maxarea=Math.max(maxarea,width*h);
        if(height[left]<height[right]){
            left++;
        }else{
            right--;
        }
      }
      return maxarea;
      
    }
}
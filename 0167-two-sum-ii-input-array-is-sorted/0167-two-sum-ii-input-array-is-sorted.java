class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result=new int[2];
        int left=0,right=numbers.length-1;
        while(left<right){
            int current_sum=numbers[left]+numbers[right];
            if(current_sum==target) {
                result[0]=left+1;
                result[1]=right+1;
                return result;
            }else if(current_sum<target){
                left++;
            }else{
                right--;
            }  
        }
        return result;
    }
}
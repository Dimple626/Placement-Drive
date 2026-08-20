class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        int n=nums.length;
        list1.add(nums[0]);
        list2.add(nums[1]);
        for(int i=2;i<n;i++){
           if(list1.get(list1.size()-1)>list2.get(list2.size()-1)){
            list1.add(nums[i]);
           }else{
            list2.add(nums[i]);
           }
           
        }
        int j=0;
        for(int i:list1){
            nums[j]=i;
            j++;
        }
        for(int i:list2){
            nums[j]=i;
            j++;
        }
        return nums;
    }
}
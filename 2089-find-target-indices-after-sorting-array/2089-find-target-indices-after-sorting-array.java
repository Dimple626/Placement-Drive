class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        // List<Integer> result=new ArrayList<>();
        // Arrays.sort(nums);
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==target){
        //         result.add(i);
        //     }
        // }
        // return result;

         ArrayList<Integer> res = new ArrayList<>();
        int belowTcount = 0;
        int Tcount = 0;
        for(int num : nums) {
            if(num < target) {
                belowTcount++;
            } else if(num == target) {
                Tcount++;
            }
        }
        for(int i = 0; i < Tcount; i++) {
            res.add(belowTcount++);
        }

        return res;
    }
}
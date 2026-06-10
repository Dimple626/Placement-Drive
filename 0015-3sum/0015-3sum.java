class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for (int start = 0; start < nums.length - 2; start++) {
            if (start > 0 && nums[start] == nums[start - 1])
                continue;
            int left = start + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[start] + nums[left] + nums[right];
                if (sum == 0) {
                    list.add(Arrays.asList(nums[start], nums[left], nums[right]));
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1])
                        left++;
                    while (left < right && nums[right] == nums[right + 1])
                        right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }

        }
        return list;
    }
}
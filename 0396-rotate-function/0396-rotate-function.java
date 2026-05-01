
class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        int arrSum = 0;
        int currVal = 0;

        // Calculate arrSum and F(0)
        for (int i = 0; i < n; i++) {
            arrSum += nums[i];
            currVal += i * nums[i];
        }

        int maxVal = currVal;

        // Compute F(k) from F(k-1)
        for (int k = 1; k < n; k++) {
            currVal = currVal + arrSum - n * nums[n - k];
            maxVal = Math.max(maxVal, currVal);
        }

        return maxVal;
    }
}

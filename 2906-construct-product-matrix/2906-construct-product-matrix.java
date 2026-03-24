class Solution {
    static int MOD = 12345;
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        long[] left = new long[n];
        long[] right = new long[n];

        left[0] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = (left[i - 1] * nums[i - 1]) % MOD;
        }
        right[n-1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            right[i] = (right[i + 1] * nums[i + 1]) % MOD;
        }
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = (int)((left[i] * right[i]) % MOD);
        }

        return ans;
    }

    public int[][] constructProductMatrix(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int size = n * m;
        int[] arr = new int[size];
        int idx = 0;
        for (int[] row : grid) {
            for (int val : row) {
                arr[idx++] = val % MOD;
            }
        }
        int[] result = productExceptSelf(arr);
        int[][] res = new int[n][m];
        idx = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                res[i][j] = result[idx++];
            }
        }

        return res;
    }
}

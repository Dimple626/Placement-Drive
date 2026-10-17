import java.util.*;

class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int[][] res = new int[n][2];

        for (int i = 0; i < n; i++) {
            res[i][0] = nums[i];
            res[i][1] = digitsum(nums[i]);
        }

        Arrays.sort(res, (a, b) -> {
            if (a[1] != b[1]) {
                return a[1] - b[1];
            }
            return a[0] - b[0];
        });

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(nums[i], i);
        }

        int cnt = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == res[i][0]) {
                continue;
            }

            cnt++;

            int correctIndex = map.get(res[i][0]);
            map.put(nums[i], correctIndex);
            map.put(res[i][0], i);

            int temp = nums[i];
            nums[i] = nums[correctIndex];
            nums[correctIndex] = temp;
        }

        return cnt;
    }

    public int digitsum(int n) {
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            sum += rem;
            n /= 10;
        }

        return sum;
    }
}

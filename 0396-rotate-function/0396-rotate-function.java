
class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;

        int[] arr = nums.clone();

        for(int k = 0; k < n; k++) {
            int f = 0;

            // Calculate F(k)
            for(int i = 0; i < n; i++) {
                f += i * arr[i];
            }

            max = Math.max(max, f);

            // Rotate array clockwise by 1
            arr = rotate(arr);
        }

        return max;
    }

    // Function to rotate array by 1 (right rotation)
    private int[] rotate(int[] arr) {
        int n = arr.length;
        int[] newArr = new int[n];

        newArr[0] = arr[n - 1]; // last element to front

        for(int i = 1; i < n; i++) {
            newArr[i] = arr[i - 1];
        }

        return newArr;
    }
}
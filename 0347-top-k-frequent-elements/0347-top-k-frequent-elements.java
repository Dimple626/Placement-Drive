class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            int maxFreq = 0;
            int maxKey = 0;
            for (int key : map.keySet()) {
                if (map.get(key) > maxFreq) {
                    maxFreq = map.get(key);
                    maxKey = key;
                }
            }

            arr[i] = maxKey;
            map.remove(maxKey);
        }

        return arr;
    }
}

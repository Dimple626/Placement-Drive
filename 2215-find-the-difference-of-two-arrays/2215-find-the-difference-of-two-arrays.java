class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res = new ArrayList<>();
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int num : nums1) {
            set1.add(num);
        }
        for(int num : nums2) {
            set2.add(num);
        }
        List<Integer> sublist1 = new ArrayList<>();
        for(int num : set1) {
            if(!set2.contains(num)) {
                sublist1.add(num);
            }
        }

        res.add(sublist1);

        List<Integer> sublist2 = new ArrayList<>();

        for(int num : set2) {
            if(!set1.contains(num)) {
                sublist2.add(num);
            }
        }

        res.add(sublist2);

        return res;
    }
}

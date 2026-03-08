class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n = nums[0].length();
        HashSet<String> set = new HashSet<>();

        for(String s : nums){
            set.add(s);
        }

        for(int i = 0; i < (1 << n); i++){
            String str = Integer.toBinaryString(i);

            while(str.length() < n){
                str = "0" + str;
            }

            if(!set.contains(str)){
                return str;
            }
        }
        return "";
    }
}

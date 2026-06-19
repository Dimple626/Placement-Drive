class Solution {
    public int largestAltitude(int[] gain) {
        int maxi = 0;
        int sum = 0;

        for(int num : gain){
            sum += num;
            maxi = Math.max(maxi, sum);
        }

        return maxi;
    }
}

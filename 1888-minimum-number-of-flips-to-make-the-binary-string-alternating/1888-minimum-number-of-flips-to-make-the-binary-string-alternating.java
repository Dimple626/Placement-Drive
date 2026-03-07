class Solution {
    public int minFlips(String s) {
        int n = s.length();
        String t = s + s;
        StringBuilder alt1 = new StringBuilder();
        StringBuilder alt2 = new StringBuilder();
        for (int i = 0; i < 2 * n; i++) {
            if (i % 2 == 0) {
                alt1.append('0');
                alt2.append('1');
            } else {
                alt1.append('1');
                alt2.append('0');
            }
        }

        int diff1 = 0, diff2 = 0;
        int l = 0, ans = Integer.MAX_VALUE;

        for (int r = 0; r < 2 * n; r++) {
            if (t.charAt(r) != alt1.charAt(r)) diff1++;
            if (t.charAt(r) != alt2.charAt(r)) diff2++;

            if (r - l + 1 > n) {
                if (t.charAt(l) != alt1.charAt(l)) diff1--;
                if (t.charAt(l) != alt2.charAt(l)) diff2--;
                l++;
            }

            if (r - l + 1 == n) {
                ans = Math.min(ans, Math.min(diff1, diff2));
            }
        }

        return ans;
    }
}

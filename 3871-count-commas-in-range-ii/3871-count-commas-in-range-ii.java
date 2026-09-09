class Solution {
    public long countCommas(long n) {
        long count = 0;

        if (n >= 1_000) {
            count += Math.min(n, 999_999L) - 999;
        }

        if (n >= 1_000_000) {
            count += (Math.min(n, 999_999_999L) - 999_999) * 2;
        }

        if (n >= 1_000_000_000) {
            count += (Math.min(n, 999_999_999_999L) - 999_999_999) * 3;
        }

        if (n >= 1_000_000_000_000L) {
            count += (Math.min(n, 999_999_999_999_999L)
                    - 999_999_999_999L) * 4;
        }

        if (n >= 1_000_000_000_000_000L) {
            count += (n - 999_999_999_999_999L) * 5;
        }

        return count;
    }
}

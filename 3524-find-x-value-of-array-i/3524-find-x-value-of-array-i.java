class Solution {
    public long[] resultArray(int[] nums, int k) {
        long[] result = new long[k];
        long[] dp = new long[k];
            for (int num : nums) {
            int rem = num % k;
            long[] next = new long[k];

            next[rem] = 1;

            for (int i = 0; i < k; i++) {
                int newRem = (int)((long)i * rem % k);
                next[newRem] += dp[i];
            }
            for (int i = 0; i < k; i++) {
                result[i] += next[i];
            }

            dp = next;
        }

        return result;
    }
}
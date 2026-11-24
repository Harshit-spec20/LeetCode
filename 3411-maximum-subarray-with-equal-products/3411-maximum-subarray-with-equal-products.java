import java.util.*;
class Solution {
    public int maxLength(int[] nums) {
        int maxLen = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            long gcd = nums[i];
            long lcm = nums[i];
            long prod = nums[i];
            for (int j = i; j < n; j++) {
                if (j > i) {
                    gcd = gcd(gcd, nums[j]);
                    lcm = lcm(lcm, nums[j]);
                    prod *= nums[j];
                }
                if (prod == lcm * gcd) {
                    maxLen = Math.max(maxLen, j - i + 1);
                } else if (j > i) {
                    break;
                }
            }
        }
        return maxLen;
    }
    private long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    private long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }
}
class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int[] count = new int[51];
        int ans = 0;

        for (int x : nums) {
            count[x]++;
        }

        for (int x : nums) {
            if (count[x] == 2) {
                ans ^= x;
                count[x] = 0;
            }
        }

        return ans;
    }
}
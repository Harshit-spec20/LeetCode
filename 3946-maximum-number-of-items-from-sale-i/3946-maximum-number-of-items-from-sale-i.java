class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
        int n = items.length;
        int[] freeCount = new int[n];

        for (int i = 0; i < n; i++) {
            int f1 = items[i][0];
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (i != j && items[j][0] % f1 == 0) {
                    count++;
                }
            }
            freeCount[i] = count;
        }

        int[] dp = new int[budget + 1];

        for (int i = 0; i < n; i++) {
            int price = items[i][1];
            int firstGain = 1 + freeCount[i];
            if (price > budget) {
                continue;
            }

            for (int b = budget; b >= price; b--) {
                if (dp[b - price] + firstGain > dp[b]) {
                    dp[b] = dp[b - price] + firstGain;
                }
            }

            for (int b = price; b <= budget; b++) {
                if (dp[b - price] + 1 > dp[b]) {
                    dp[b] = dp[b - price] + 1;
                }
            }
        }

        int ans = 0;
        for (int b = 0; b <= budget; b++) {
            if (dp[b] > ans) {
                ans = dp[b];
            }
        }
        return ans;
    }
}
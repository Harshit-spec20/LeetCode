class Solution {
    public int climbStairs(int n, int[] costs) {
        int[] d = new int[n + 1];
        for (int j = 1; j <= n; j++) {
            int minCost = Integer.MAX_VALUE;
            for (int k = 1; k <= 3; k++) {
                int i = j - k;
                if (i >= 0) {
                    int cost = d[i] + costs[j - 1] + (j - i) * (j - i);
                    if (cost < minCost) {
                        minCost = cost;
                    }
                }
            }
            d[j] = minCost;
        }
        return d[n];
    }
}
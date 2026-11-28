class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
        int n = items.length;
        int[] freq = new int[n + 1];
        for (int[] item : items) {
            freq[item[0]]++;
        }
        int[] gain = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = i; j <= n; j += i) {
                count += freq[j];
            }
            gain[i] = count - 1;
        }
        Arrays.sort(items, (a, b) -> Integer.compare(a[1], b[1]));
        long remaining = budget;
        long ans = 0;
        int minPrice = items[0][1];
        for (int[] item : items) {
            int factor = item[0];
            int price = item[1];
            if (price >= 2L * minPrice) {
                break;
            }
            long take = Math.min((long) gain[factor], remaining / price);
            ans += take * 2;
            remaining -= take * price;
        }
        ans += remaining / minPrice;

        return (int) ans;
    }
}
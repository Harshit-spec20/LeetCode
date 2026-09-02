class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0;
        int count = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        if (sum/k >=threshold)
            count++;

        for (int i = 1; i <=arr.length-k; i++) {
            sum = sum - arr[i - 1] + arr[i+k-1];

            if (sum/k >=threshold)
                count++;
        }

        return count;
    }
}
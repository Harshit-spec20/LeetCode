class Solution {
    public int[] getAverages(int[] nums, int k) {

        int length = nums.length;
        int[] result = new int[length];

        int window = 2 * k + 1;

        if (window > length) {
            for (int i = 0; i < length; i++) {
                result[i] = -1;
            }
            return result;
        }

        for (int i = 0; i < k; i++) {
            result[i] = -1;
        }

        for (int i = length - k; i < length; i++) {
            result[i] = -1;
        }

        long sum = 0;

        for (int i = 0; i < window; i++) {
            sum += nums[i];
        }

        result[k] = (int)(sum / window);

        for (int i = 1; i <= length - window; i++) {
            sum = sum - nums[i - 1] + nums[i + window - 1];
            result[i + k] = (int)(sum / window);
        }

        return result;
    }
}
class Solution {
    public int findNonMinOrMax(int[] nums) {
        if (nums.length < 3)
            return -1;

        Arrays.sort(nums);

        if (nums[0] == nums[nums.length - 1])
            return -1;

        return nums[1];
    }
}
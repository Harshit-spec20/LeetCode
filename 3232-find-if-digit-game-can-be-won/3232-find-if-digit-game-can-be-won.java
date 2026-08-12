class Solution {
    public boolean canAliceWin(int[] nums) {
        int one = 0;
        int two = 0;

        for (int n : nums) {
            if (n < 10)
                one += n;
            else
                two += n;
        }

        return one != two;
    }
}
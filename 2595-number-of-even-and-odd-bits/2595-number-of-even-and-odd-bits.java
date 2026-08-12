class Solution {
    public int[] evenOddBit(int n) {
        int even = 0;
        int odd = 0;
        int pos = 0;

        while (n > 0) {
            if (n % 2 == 1) {
                if (pos % 2 == 0)
                    even++;
                else
                    odd++;
            }

            n = n / 2;
            pos++;
        }

        return new int[]{even, odd};
    }
}
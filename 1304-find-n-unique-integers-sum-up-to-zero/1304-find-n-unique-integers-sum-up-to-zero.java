class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        int a = 0;
        for (int i = 0; i < n / 2; i++) {
            arr[a] = i + 1;
            arr[a + 1] = -(i + 1);
            a = a + 2;
        }
        if (n % 2 == 1) {
            arr[a] = 0;
        }
        return arr;
    }
}
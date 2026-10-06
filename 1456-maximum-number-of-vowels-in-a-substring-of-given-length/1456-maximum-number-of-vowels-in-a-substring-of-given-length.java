class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        int max = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' ||
                s.charAt(i) == 'i' || s.charAt(i) == 'o' ||
                s.charAt(i) == 'u') {
                count++;
            }

            if (i >= k) {
                if (s.charAt(i - k) == 'a' || s.charAt(i - k) == 'e' ||
                    s.charAt(i - k) == 'i' || s.charAt(i - k) == 'o' ||
                    s.charAt(i - k) == 'u') {
                    count--;
                }
            }

            max = Math.max(max, count);
        }

        return max;
    }
}
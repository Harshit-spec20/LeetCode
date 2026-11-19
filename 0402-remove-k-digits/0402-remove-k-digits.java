class Solution {
    public String removeKdigits(String num, int k) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            while (k > 0 && sb.length() > 0 && sb.charAt(sb.length() - 1) > c) {
                sb.deleteCharAt(sb.length() - 1);
                k--;
            }
            sb.append(c);
        }

        while (k > 0 && sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
            k--;
        }

        int idx = 0;
        while (idx < sb.length() && sb.charAt(idx) == '0') {
            idx++;
        }

        String result = sb.substring(idx);
        return result.isEmpty() ? "0" : result;
    }
}
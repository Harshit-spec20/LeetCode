class Solution {
    public String toHex(int num) {
        if (num == 0) return "0";

        String s = "";
        char[] hex = "0123456789abcdef".toCharArray();

        while (num != 0) {
            s = hex[num & 15] + s;
            num >>>= 4;
        }

        return s;
    }
}
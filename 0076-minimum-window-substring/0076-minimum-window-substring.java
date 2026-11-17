class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) {
            return "";
        }
        
        int[] targetFreq = new int[128];
        for (char c : t.toCharArray()) {
            targetFreq[c]++;
        }
        
        int left = 0, right = 0;
        int required = t.length();
        int minLen = Integer.MAX_VALUE;
        int minLeft = 0;
        
        while (right < s.length()) {
            char rChar = s.charAt(right);
            if (targetFreq[rChar] > 0) {
                required--;
            }
            targetFreq[rChar]--;
            right++;
            
            while (required == 0) {
                if (right - left < minLen) {
                    minLen = right - left;
                    minLeft = left;
                }
                
                char lChar = s.charAt(left);
                targetFreq[lChar]++;
                if (targetFreq[lChar] > 0) {
                    required++;
                }
                left++;
            }
        }
        
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minLeft, minLeft + minLen);
    }
}
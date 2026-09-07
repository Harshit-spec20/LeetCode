class Solution {
    public int countGoodSubstrings(String s) {
        int count = 0;
        int window = 3;
        int n = s.length();
        for(int i=0; i<=n-window; i++){
            String sub = s.substring(i, i+window);
            if (sub.charAt(0) != sub.charAt(1) && 
                sub.charAt(1) != sub.charAt(2) && 
                sub.charAt(2) != sub.charAt(0)) { 
                count++;
            }
        }
        return count;
    }
}
class Solution {
    public int titleToNumber(String col) {
        int n = col.length();
        int sum = 0;
        int p = 0;
        for(int i=n-1;i>=0;i--){
            int temp = col.charAt(i)-64;
            sum += (int)Math.pow(26,p++)*temp;
        }
        return sum;
    }
}
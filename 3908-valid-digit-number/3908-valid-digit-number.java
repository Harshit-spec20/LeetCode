class Solution {
    public boolean validDigit(int n, int x) {
        boolean ans=false;
        while(n>9){
            int d=n%10;
            if(d==x){
                ans=true;
            }
            n=n/10;

        }
        return ans&&(n!=x);
    }
}
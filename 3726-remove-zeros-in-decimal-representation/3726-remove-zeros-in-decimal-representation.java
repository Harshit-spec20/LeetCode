class Solution {
    public long removeZeros(long n) {
        long ans=0;
        long a=1;
        while(n!=0){
            long d=n%10;
            if(d!=0){
                ans+=(a*d);
                a*=10;
            }
            n/=10;
        }
        return ans;
    }
}
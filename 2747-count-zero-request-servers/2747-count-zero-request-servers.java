class Solution {
    public int[] countServers(int n, int[][] logs, int x, int[] queries) {
        int m=queries.length;
        int[] ans=new int[m];
        int[][] q=new int[m][2];

        for(int i=0;i<m;i++){
            q[i][0]=queries[i];
            q[i][1]=i;
        }

        Arrays.sort(q,(a,b)->a[0]-b[0]);
        Arrays.sort(logs,(a,b)->a[1]-b[1]);

        int[] count=new int[n+1];
        int left=0,right=0,active=0;

        for(int i=0;i<m;i++){
            int t=q[i][0];

            while(right<logs.length&&logs[right][1]<=t){
                int s=logs[right][0];
                if(count[s]++==0) active++;
                right++;
            }

            while(left<right&&logs[left][1]<t-x){
                int s=logs[left][0];
                if(--count[s]==0) active--;
                left++;
            }

            ans[q[i][1]]=n-active;
        }

        return ans;
    }
}
import java.util.HashMap;
import java.util.Map;
class Solution {
    public int maxSubarray(int[] nums) {
        int n=nums.length;
        int[]maxL=new int[n];
        for(int i=0;i<n;i++){
            maxL[i]=-1;
        }
        Map<Integer,Integer>lastSeen=new HashMap<>();

        for(int j=0;j<n;j++){
            for(int r=j+1;r<n;r++){
                int t1=nums[r]-nums[j];
                int t2=nums[j]-nums[r];
                int t3=nums[r]+nums[j];

                if(lastSeen.containsKey(t1)){
                    maxL[r]=Math.max(maxL[r],lastSeen.get(t1));
                }
                if(lastSeen.containsKey(t2)){
                    maxL[r]=Math.max(maxL[r],lastSeen.get(t2));
                }
                if(lastSeen.containsKey(t3)){
                    maxL[r]=Math.max(maxL[r],lastSeen.get(t3));
                }
            }
            lastSeen.put(nums[j],j);
        }
        int ans=0;
        int l=0;

        for(int r=0;r<n;r++){
            l=Math.max(l,maxL[r]+1);
            ans=Math.max(ans,r-l+1);
        }
        return ans;
        
    }
}
class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int k=0;

        for(int i=0;i<n;i++){
            int num=nums[i];

            if(k<2 || num >nums[k-2]){
                nums[k]=num;
                k++;
            }
        }
        return k;
        
    }
}
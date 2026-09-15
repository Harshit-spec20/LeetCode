class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int start=0;
        int end=1;

        while(start<nums.length && end<nums.length){
            if(nums[start]%2==0){
                start+=2;
            }
            else if(nums[end]%2 !=0){
                end+=2;
            }else{
                int temp=nums[start];
                nums[start]=nums[end];
                nums[end]=temp;
                start+=2;
                end+=2;
            }
        }
        return  nums;
        
    }
}
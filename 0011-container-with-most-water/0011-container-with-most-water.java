class Solution {
    public int maxArea(int[] height) {
        int start=0;
        int end=height.length-1;
        int maxValue=0;

        while(start<end){
            if(height[start] < height[end]){
                maxValue=Math.max(maxValue,height[start]*(end-start));
                start++;

            }else{
                maxValue=Math.max(maxValue,height[end]*(end-start));
                end--;

            }
        }
        return maxValue;

    }
}
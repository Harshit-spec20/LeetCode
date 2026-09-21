class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums2);

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < nums1.length; i++) {
            if(binarySearch(nums2, nums1[i]) && !list.contains(nums1[i])) {
                list.add(nums1[i]);
            }
        }

        int[] result = new int[list.size()];

        for(int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    public boolean binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(nums[mid] == target) {
                return true;
            }
            else if(nums[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        return false;
    }
}
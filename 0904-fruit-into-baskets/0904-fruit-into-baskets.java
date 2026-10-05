class Solution {
    public int totalFruit(int[] fruits) {
        int left = 0;
        int type1 = -1;
        int type2 = -1;
        int count1 = 0;
        int count2 = 0;
        int max = 0;

        for (int right = 0; right < fruits.length; right++) {

            if (fruits[right] == type1) {
                count1++;
            }
            else if (fruits[right] == type2) {
                count2++;
            }
            else {
                while (count1 > 0 && count2 > 0) {
                    if (fruits[left] == type1) {
                        count1--;
                    }
                    else {
                        count2--;
                    }

                    left++;
                }
                if (count1 == 0) {
                    type1 = fruits[right];
                    count1 = 1;
                }
                else {
                    type2 = fruits[right];
                    count2 = 1;
                }
            }
            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}
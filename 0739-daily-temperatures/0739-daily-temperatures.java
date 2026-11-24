class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];
        int[] stack = new int[n];
        int top = -1;

        int i = n - 1;
        while (i >= 0) {
            for (; top >= 0 && temperatures[stack[top]] <= temperatures[i]; top--) {
            }

            if (top >= 0) {
                answer[i] = stack[top] - i;
            }

            stack[++top] = i;
            i--;
        }

        return answer;
    }
}
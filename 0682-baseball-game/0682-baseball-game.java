class Solution {
    public int calPoints(String[] operations) {

        int[] arr = new int[operations.length];
        int top = 0;

        for (String op : operations) {

            if (op.equals("C")) {
                top--;
            }
            else if (op.equals("D")) {
                arr[top] = 2 * arr[top - 1];
                top++;
            }
            else if (op.equals("+")) {
                arr[top] = arr[top - 1] + arr[top - 2];
                top++;
            }
            else {
                arr[top] = Integer.parseInt(op);
                top++;
            }
        }

        int sum = 0;

        for (int i = 0; i < top; i++) {
            sum += arr[i];
        }

        return sum;
    }
}
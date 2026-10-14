class Solution {
    public double myPow(double x, int n) {
        long power = n;
        boolean neg = power < 0; 
        if (neg) power = -power;
        double result = calcPower(x, power);
        if (neg) return 1.0 / result;
        return result;
    }
    private double calcPower(double x, long power) {
        if (power == 0) return 1.0;
        double half = calcPower(x, power / 2);
        if (power % 2 == 0) return half * half;
        return half * half * x;
    }
}
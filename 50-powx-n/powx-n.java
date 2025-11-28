class Solution {
    public double myPow(double x, int n) {
        long N = n; 
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        return fastPow(x, N);
    }
    private double fastPow(double x, long N) {
        if (N == 0) return 1.0;
        if (N == 1) return x;
        double half = fastPow(x, N / 2); 
        if (N % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
}

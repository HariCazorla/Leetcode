class Solution {
    public int divide(int dividend, int divisor) {
        
        if (dividend == 0) return 0;
        if (divisor == 1) return dividend;
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        if (divisor == Integer.MIN_VALUE) {
            if (dividend == Integer.MIN_VALUE)
                return 1;
            else return 0;
        }
        boolean sign = false;
        
        if ((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0)){
            sign = true;
        }
        int quotient = 0;        
        if (dividend == Integer.MIN_VALUE) {
            dividend = dividend + Math.abs(divisor);
            quotient = 1;
        }
        long a = Math.abs(dividend);
        long b = Math.abs(divisor);
        while(a >= b) {
            a = a - b;
            quotient++;
        }
        
        return sign ? -quotient : quotient;
    }
}
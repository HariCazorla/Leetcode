class Solution {
    public int myAtoi(String s) {
        boolean isNeg = false;
        long result = 0;
        s = s.trim();
        int length = s.length();
        
        if (s.length() < 1) {
            return 0;
        }
        if (s.charAt(0) == '-') {
                isNeg = true;
        }
        int i = ((s.charAt(0) == '-' || s.charAt(0) == '+') ? 1 : 0);
        while ( i < length) {
            
            if (!Character.isDigit(s.charAt(i))) {
                break;
            }
            
            result = result * 10 + (s.charAt(i)-'0');
                        
            if (isNeg && -1*result < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
            
            if (!isNeg && result > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            
            i++;
        }
        return (int)(isNeg ? result * -1 : result);
    }
}
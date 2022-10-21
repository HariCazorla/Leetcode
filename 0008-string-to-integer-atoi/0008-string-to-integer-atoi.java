class Solution {
    public int myAtoi(String s) {
        boolean isNeg = false;
        int result = 0;
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
            if(result > (Integer.MAX_VALUE / 10) || (result == (Integer.MAX_VALUE / 10) && (s.charAt(i)-'0') > 7)){
                return isNeg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            
            result = result * 10 + (s.charAt(i)-'0');
            
            i++;
        }
        return (isNeg ? result * -1 : result);
    }
}
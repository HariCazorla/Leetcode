class Solution {
    public boolean isMatch(String s, String p) {
        return dp(0, 0, s, p);
    }
    
    public boolean dp(int i, int j, String s, String p) {
        if ((i > s.length() - 1) && (j > p.length() - 1)) {
            return true;
        }
        
        if (j > p.length() - 1) {
            return false;
        }
        
        boolean match = false;
        
        if (i < s.length() && ((s.charAt(i) == p.charAt(j)) || (p.charAt(j) == '.'))) {
            match = true;
        }
        
        if ((j + 1 < p.length()) && p.charAt(j + 1) == '*') {
            return ((dp(i, j+2, s, p)) || (match && dp(i+1, j, s, p)));
        }
        
        if (match) {
            return dp(i+1, j+1, s, p);
        } else {
            return false;
        }
    }
}
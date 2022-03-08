class Solution {    
    public boolean isMatch(String s, String p) {
        Boolean map[][] = new Boolean [s.length()+1][p.length()+1];
        return dp(0, 0, s, p, map);
    }
    
    public boolean dp(int i, int j, String s, String p, Boolean map[][]) {
        
        if (map[i][j] != null) {
            return map[i][j];
        }
        
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
            map[i][j] = ((dp(i, j+2, s, p, map)) || (match && dp(i+1, j, s, p, map)));
            return map[i][j];
        }
        
        if (match) {
            map[i][j] = dp(i+1, j+1, s, p, map);
            return map[i][j];
        } else {
            map[i][j] = false;
            return map[i][j];
        }
    }
}
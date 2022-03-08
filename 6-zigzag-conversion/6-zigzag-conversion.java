class Solution {
    public String convert(String s, int numRows) {
        String solution = "";
        int k = 2*numRows - 2;
        
        if (s.length() < 3 || numRows == 1) return s;
        for (int i = 0; i < numRows; i++) {
            boolean flag = false;
            for (int j = i; j < s.length(); ) {
                solution += s.charAt(j);
                
                if (i == 0 || i == numRows-1) {
                    j += k;
                } else {
                    j += (flag ? 2*i : k - 2*i);
                }
                
                flag = !flag;
            }
        }
        return solution;
    }
}
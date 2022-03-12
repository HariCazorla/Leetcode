class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> ans = new ArrayList<String>();
        
        backtrack(ans, "", 0, 0, n);
        
        return ans;
    }
    
    public void backtrack(List<String> ans, String currentString, int open, int close, int max) {
        if (currentString.length() == max*2) {
            ans.add(currentString);
            return;
        }
        
        if (open < max) {
            backtrack(ans, currentString + "(", open+1, close, max);
        }
        
        if (close < open) {
            backtrack(ans, currentString + ")", open, close+1, max);
        }
    }
}
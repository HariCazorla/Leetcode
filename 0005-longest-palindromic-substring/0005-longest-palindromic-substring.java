class Solution {
    public String longestPalindrome(String s) {
        int start = 0;
        int end = 0;
        for(int i=0; i<s.length(); i++) {
            int l1 = expandAroundCenter(s, i, i);
            int l2 = expandAroundCenter(s, i, i+1);
            int mx = Math.max(l1, l2);
            if (mx > end-start) {
                start = i - (mx-1)/2;
                end = i + mx/2;
            }
            
        }
        
        System.out.println(s.substring(start, end+1));
        return s.substring(start, end+1);
    }
    
    public int expandAroundCenter(String s, int left, int right) {
        while(left >=0 && right < s.length() && s.charAt(left)==s.charAt(right)) {
            left--;
            right++;
        }
        
        return right - left -1;
    }
    
}
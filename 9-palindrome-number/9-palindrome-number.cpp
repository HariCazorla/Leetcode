class Solution {
    public boolean isPalindrome(int x) {
        String num = Integer.toString(x);
        
        int l = num.length();
        int i = 0;
        int j = l-1;
        
        while (i < j) {
            if (num.charAt(i) == num.charAt(j)) {
                i++;
                j--;
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
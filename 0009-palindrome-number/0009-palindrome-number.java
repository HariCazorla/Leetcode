class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int originalNumber = x;
        int revertedNumber = 0;
        while(x != 0) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        
        return originalNumber == revertedNumber;
    }
}
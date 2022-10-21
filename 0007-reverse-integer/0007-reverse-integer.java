class Solution {
    public int reverse(int x) {
        String reverse = new StringBuilder().append(Math.abs(x)).reverse().toString();
        try {
            return ((x < 0) ? Integer.parseInt(reverse) * -1 : Integer.parseInt(reverse));
        } catch (Exception ex) {
            return 0;
        }
    }
}
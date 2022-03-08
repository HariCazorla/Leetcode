class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int vol = 0;
        while (i < j) {
            vol = Math.max(vol, (j-i)*Math.min(height[i], height[j]));
            
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }     
        }
        return vol;
    }
}
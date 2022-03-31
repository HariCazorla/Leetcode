class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        int position = -1;
        while(low <= high) {
            int mid = (low + high) / 2;
            
            if (nums[mid] == target) {
                position = mid;
                break;
            }
            
            if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        return (position == -1) ? low : position;
    }
}
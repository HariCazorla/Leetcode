class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int l = nums.length;
        int min = Integer.MAX_VALUE;
        int ans = 0;
        for (int i = 0; i < l - 1; i++) {
            int low = i+1;
            int high = l-1;
            while (low < high) {
                int sum = nums[i] + nums[low] + nums[high];
                int diff = target - sum;
                int absDiff = Math.abs(diff);
                
                if (absDiff < min) {
                    min = absDiff;
                    ans = sum;
                }
                
                if (absDiff == 0) {
                    return ans;
                } else if (diff > 0) {
                    low++;
                } else {
                    high--;
                }
            }            
        }
        return ans;
    }
}
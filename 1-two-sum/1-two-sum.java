class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0, j = 0;
        int solution[];
        solution = new int[2];
        for (i=0; i < nums.length; i++) {
            for (j=i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    solution[0] = i;
                    solution[1] = j;
                    break;
                }
            }
        }
        return solution;
    }
}
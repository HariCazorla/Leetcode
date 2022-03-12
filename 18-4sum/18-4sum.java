class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int l = nums.length;
        Set<List<Integer>> solution = new HashSet<List<Integer>>();
        for (int i = 0; i < l-3; i++) {
            for (int j = i+1; j < l-2; j++) {
                int low = j+1;
                int high = l-1;
                while(low < high) {
                    int sum = nums[i] + nums[j] + nums[low] + nums[high];
                    if (sum == target) {
                        solution.add(Arrays.asList(nums[i], nums[j], nums[low], nums[high]));
                        while(low < high && nums[low] == nums[low+1]) low++;
                        while(low < high && nums[high] == nums[high-1]) high--;
                        low++;
                        high--;
                    } else if (sum > target) {
                        high--;
                    } else {
                        low++;
                    }
                }
            }
        }
        return solution.stream().collect(Collectors.toList());  
    }
}
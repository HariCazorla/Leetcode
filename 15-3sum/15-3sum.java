class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList();
        Arrays.sort(nums);
        int l = nums.length;
        for (int i = 0; i < l-2; i++) {
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
                int low = i+1;
                int high = l-1;
                int target = 0 - nums[i];
                while(low < high) {
                    if (nums[low] + nums[high] == target) {
                        result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                        while(low < high && nums[low] == nums[low+1]) {
                            low++;
                        }
                        while(low < high && nums[high] == nums[high-1]) {
                            high--;
                        }
                        low++;
                        high--;
                    } else if (nums[low] + nums[high] > target) {
                        high--;
                    } else {
                        low++;
                    }
                }
            }
        System.out.println(result);
        return result;
    }
}
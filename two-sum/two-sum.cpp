class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int> solution;
        unordered_map<int, int> mapper;
        for( int i=0; i<nums.size(); i++) 
        {
          if (mapper.count(target-nums[i])) 
          {
              return {mapper[target-nums[i]], i};
          }
          mapper[nums[i]] = i;
        }
        return {};
    }
};
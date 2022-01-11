class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int size = nums.size();
        if (size == 0)
            return 0;
        int index = 1;
        int count = 1;
        for (int i=0; i<size-1; i++)
        {
            if (nums[i] == nums[i+1])
                continue;
            else
            {
                nums[index++] = nums[i+1];
                count++;
            }
        }
        return count;
    }
};
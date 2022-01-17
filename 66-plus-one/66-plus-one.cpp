class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {
        int size = digits.size();
        int i = size-1;
        int carry = 0;
        while(i >= 0)
        {
            if (digits[i] == 9)
            {
                carry = 1;
                digits[i] = 0;
            }
            else
            {
                digits[i] += 1;
                carry = 0;
                break;
            }
            if (carry && i == 0)
            {
                digits.insert(digits.begin(), 1);
            }
            i--;
        }
        return digits;
    }
};
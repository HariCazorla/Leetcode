class Solution {
public:
    bool isPalindrome(int x) {
        if (x >= 0)
        {
        vector<int> digits;
        while(x)
        {
            int digit = x % 10;
            digits.push_back(digit);
            x = x / 10;
        }
        int size = digits.size();
        int i=0;
        int j = size ? size - 1 : 0;
        bool isPal = true;
        if (i >= 0 && j >=0)
        {
            while (i <= j)
            {
                if ( i == 0 && j == 0)
                {
                    break;                      
                }
                if (digits[i] == digits[j])
                {
                    i++;
                    j--;
                    continue;                
                }
                else
                {
                    isPal = false;
                    break;                
                }
            }
        }
        else
        {
            isPal = false;            
        }
        return isPal;
        }
        else
        {
            return false;
        }
    }
};
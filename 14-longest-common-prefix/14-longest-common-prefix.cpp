#include <string.h>
class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        int size = strs.size();
        string res = "";
        string baseString = strs[0];
        
        if (size == 1)
        {
            return baseString;
        }
        for(int i=0; i < baseString.size(); i++)
        {
            bool isPrefix = false;
            for (int j = 1; j < size; j++)
            {
                if (baseString[i] == strs[j][i])
                {
                    isPrefix = true;
                }
                else
                {
                    isPrefix = false;
                    break;
                }
            }
            if (isPrefix)
                res += baseString[i];
            else
                break;
        }
        return res;
    }
};
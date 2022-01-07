class Solution {
public:
    int romanToInt(string s) {
        int size = s.size();
        map<char, int> table = {{'I',1},{'V',5},{'X',10},{'L',50},{'C',100},{'D',500},{'M',1000}};
        int i = 0;
        int ans = 0;
        while (i < size)
        {
            if (table[s[i]] >= table[s[i+1]])
            {
                ans = ans + table[s[i]];
                i++;
            }
            else
            {
                int diff = table[s[i+1]] - table[s[i]];
                i = i+2;
                ans = ans + diff;
            }
        }
        return ans;
    }
};
class Solution {
    public int strStr(String haystack, String needle) {
        int hayStackLength = haystack.length();
        int needleLength = needle.length();
        
        if (needleLength == 0) {
            return 0;
        }
        
        if (needleLength > hayStackLength) {
            return -1;
        }
        
        int count = 0;        
        for (int i = 0; i <= hayStackLength - needleLength; i++) {
            count = 0;
            for (int j = 0; j < needleLength; j++) {
                if (needle.charAt(j) != haystack.charAt(i+j)) {
                    break;
                }
                count++;
            }
            if (count == needleLength) {
                return i;
            }
        }
        return -1;
    }
}
class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        t = sorted(nums1 + nums2)
        m = len(nums1)
        n = len(nums2)
        if m == 0 and n == 0:
            return 0
        if ((m+n) % 2 == 0):
            i = (m+n) // 2
            return float((t[i]+t[i-1])/2)
        else:
            i = (m+n)// 2
            return float(t[i])
        
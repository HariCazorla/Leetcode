class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k=0;
        while(i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                result[k++] = nums1[i++];
            } else {
                result[k++] = nums2[j++];
            }
        }
        while (j < nums2.length) {
            result[k++] = nums2[j++];
        }
        while (i < nums1.length) {
            result[k++] = nums1[i++];
        }
        
        int resultLength = nums1.length + nums2.length;
        for (int z=0; z<resultLength; z++) {
            System.out.println(result[z]);    
        }
        
        if (resultLength % 2 == 0) {
            return (result[resultLength/2] + result[(resultLength/2)-1]) / 2.0;
        } else {
            return result[resultLength/2];
        }
    }
}
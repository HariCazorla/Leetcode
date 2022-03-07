class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        int sa[] = new int[nums1.length + nums2.length];
        int k = 0;
        while ( i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                sa[k] = nums1[i];
                k++;
                i++;
            } else {
                sa[k] = nums2[j];
                k++;
                j++;
            }
        }
        
        while (i < nums1.length) {
            sa[k] = nums1[i];
            k++;
            i++;
        }
        
        while (j < nums2.length) {
            sa[k] = nums2[j];
            k++;
            j++;
        }
        
        int length = nums1.length + nums2.length;
        System.out.println(length);
        if (length % 2 == 0) {
            double a = sa[length/2];
            double b = sa[(length/2) - 1];
            System.out.println(a);
            System.out.println(b);
            return (a+b) / 2;
        } else {
            return sa[length/2];
        }
    }
}
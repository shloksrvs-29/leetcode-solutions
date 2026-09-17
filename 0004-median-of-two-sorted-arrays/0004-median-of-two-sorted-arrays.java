class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n = nums1.length;
        int m = nums2.length;

        int[] arr = new int[n + m];

        int i = 0, k = 0, j = 0;

        while (i < n && k < m) {

            if (nums1[i] < nums2[k]) {
                arr[j] = nums1[i];
                i++;
            } else {
                arr[j] = nums2[k];
                k++;
            }

            j++;
        }

        while (i < n) {
            arr[j++] = nums1[i++];
        }

        while (k < m) {
            arr[j++] = nums2[k++];
        }

        int len = n + m;

        if (len % 2 == 1) {
            return arr[len / 2];
        } else {
            return (arr[len / 2 - 1] + arr[len / 2]) / 2.0;
        }
    }
}
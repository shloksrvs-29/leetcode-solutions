import java.util.Arrays;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        int[] arr = new int[Math.min(nums1.length, nums2.length)];
        int x = 0;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {

                if (nums1[i] == nums2[j]) {

                    boolean found = false;

                    for (int k = 0; k < x; k++) {
                        if (arr[k] == nums1[i]) {
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        arr[x] = nums1[i];
                        x++;
                    }

                    break;
                }
            }
        }

        return Arrays.copyOf(arr, x);
    }
}
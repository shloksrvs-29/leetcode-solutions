import java.util.Arrays;

class Solution {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;
        int[] arr = new int[n];

        int left = (n - 1) / 2;
        int right = n - 1;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                arr[i] = nums[left--];
            } else {
                arr[i] = nums[right--];
            }
        }

        System.arraycopy(arr, 0, nums, 0, n);
    }
}
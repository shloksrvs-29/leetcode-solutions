class Solution {

    public int minOperations(int[] nums, int x) {

        int tsum = 0;

        for (int ele : nums) {
            tsum += ele;
        }

        if (x > tsum) {
            return -1;
        }

        int keep = tsum - x;

        if (keep == 0) {
            return nums.length;
        }

        int left = 0;
        int sum = 0;
        int maxLen = -1;

        for (int right = 0; right < nums.length; right++) {

            sum += nums[right];

            while (sum > keep) {
                sum -= nums[left];
                left++;
            }

            if (sum == keep) {
                int len = right - left + 1;
                maxLen = Math.max(maxLen, len);
            }
        }

        if (maxLen == -1) {
            return -1;
        }

        return nums.length - maxLen;
    }
}
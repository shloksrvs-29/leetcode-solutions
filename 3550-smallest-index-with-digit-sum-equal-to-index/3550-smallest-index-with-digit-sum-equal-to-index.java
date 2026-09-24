class Solution {

    public int smallestIndex(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            int sum = 0;
            int s = nums[i];

            while (s != 0) {
                sum += Math.abs(s % 10);
                s /= 10;
            }

            if (i == Math.abs(sum)) {
                return i;
            }
        }

        return -1;
    }
}
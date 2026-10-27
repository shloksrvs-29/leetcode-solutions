class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int count = 1;

            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            if (count > n / 3 && !res.contains(nums[i])) {
                res.add(nums[i]);
            }
        }

        return res;
    }
}
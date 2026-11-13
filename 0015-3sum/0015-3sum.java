class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> st = new HashSet<>();
        int n = nums.length;

        Arrays.sort(nums);

        for (int i = 0; i < n - 2; i++) {
            Set<Integer> seen = new HashSet<>();

            for (int j = i + 1; j < n; j++) {
                int third = -(nums[i] + nums[j]);

                if (seen.contains(third)) {
                    List<Integer> ans = Arrays.asList(
                        nums[i], third, nums[j]
                    );
                    st.add(ans);
                }

                seen.add(nums[j]);
            }
        }

        return new ArrayList<>(st);
    }
}
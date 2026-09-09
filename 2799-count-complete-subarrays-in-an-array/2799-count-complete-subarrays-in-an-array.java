class Solution {
    public int countCompleteSubarrays(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        // Count distinct elements in entire array
        for (int ele : nums) {
            set.add(ele);
        }

        int required = set.size();

        HashMap<Integer, Integer> map = new HashMap<>();

        int left = 0;
        int count = 0;

        for (int right = 0; right < nums.length; right++) {

            map.put(nums[right],
                    map.getOrDefault(nums[right], 0) + 1);

            while (map.size() == required) {

                count += nums.length - right;

                map.put(nums[left], map.get(nums[left]) - 1);

                if (map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                }

                left++;
            }
        }

        return count;
    }
} 
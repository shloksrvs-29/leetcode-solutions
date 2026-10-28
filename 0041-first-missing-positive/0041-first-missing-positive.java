class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> res= new HashSet<>();
        for (int ele:nums)
        {
            res.add(ele);
        }
        for (int i=1;i<=nums.length+1;i++)
        {
            if (!res.contains(i))
            {
                return i;
            }
        }
        return -1;
    }
}
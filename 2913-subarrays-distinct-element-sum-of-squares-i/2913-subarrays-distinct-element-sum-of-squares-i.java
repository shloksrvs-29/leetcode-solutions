import java.util.List;
import java.util.HashSet;

class Solution {
    public int sumCounts(List<Integer> nums) {
        int sum = 0;
        int n = nums.size();
        
        for (int i = 0; i < n; i++) {
            HashSet<Integer> distinctElements = new HashSet<>();
            
            for (int j = i; j < n; j++) {
                distinctElements.add(nums.get(j));
                
                int count = distinctElements.size();
                
                sum += count * count;
            }
        }
        
        return sum;
    }
}

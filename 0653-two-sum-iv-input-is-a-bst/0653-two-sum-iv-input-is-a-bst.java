class Solution {
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> values = new ArrayList<>();
        collectValues(root, values);
        
        int n = values.size();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (values.get(i) + values.get(j) == k) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private void collectValues(TreeNode node, List<Integer> values) {
        if (node == null) return;
        values.add(node.val);
        collectValues(node.left, values);
        collectValues(node.right, values);
    }
}